package com.checkin.crud.service;

import com.checkin.crud.domain.User;
import com.checkin.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // cadastrar usuario

    public ResponseEntity<?> addNewUser(User user){
        try {
            return new ResponseEntity<User>(this.userRepository.save(user), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<String>("Não foi possivel cadastrar o usutario", HttpStatus.BAD_REQUEST);
        }
    }

    // listar todos os usuarios
    public List<User> listAllUsers(){
        return userRepository.findAll();
    }

    // listar por id

    // alterar usuario por id

    // deletar usuario por id


    // secessao de eventos

    // criar evento
    // lsitar todos os eventos
    // listar evento por id
    // alterar evento por id
    // deletar evento por id

}
