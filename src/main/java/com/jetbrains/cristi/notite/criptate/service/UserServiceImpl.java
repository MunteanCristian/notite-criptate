package com.jetbrains.cristi.notite.criptate.service;

import com.jetbrains.cristi.notite.criptate.model.Note;
import com.jetbrains.cristi.notite.criptate.model.User;
import com.jetbrains.cristi.notite.criptate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService, NoteObserver{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {return userRepository.findAll();}

    @Override
    public User getUserById(Long id) {return userRepository.findById(id).orElse(null);}

    @Override
    public User createUser(User user) {return userRepository.save(user);}

    @Override
    public User updateUser(Long id, String email, User user) {
        if(!userRepository.existsById(id)) {
            return null;
        }
        user.setEmail(email);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void notifyNoteUpdate(Note note) {
        System.out.println("Note updated: " + note.getTitle());
    }
}
