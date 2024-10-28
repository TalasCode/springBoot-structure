package com.springBoot3.Tala.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot3.Tala.Services.UserService;
import com.springBoot3.Tala.models.Response;
import com.springBoot3.Tala.models.User;

import lombok.RequiredArgsConstructor;

import static java.time.LocalDateTime.now;

//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")

public class UserController {

        private final UserService userService;

        // public UserController(@Qualifier("userServiceImp2") UserService userService)
        // {
        // this.userService = userService;
        // }

        @GetMapping("/all")
        public ResponseEntity<Response> getAllUsers() {
                return ResponseEntity.ok(
                                Response.builder()
                                                .timeStamp(now())
                                                .status(OK)
                                                .statusCode(OK.value())
                                                .message("All users are Retrieved")
                                                .data(Map.of("users", this.userService.getAll()))
                                                .build());

        }

        @GetMapping("/get/{id}")
        public ResponseEntity<Response> getUser(@PathVariable("id") Long idLong) {
                return ResponseEntity.ok(
                                Response.builder()
                                                .timeStamp(now())
                                                .status(OK)
                                                .statusCode(OK.value())
                                                .message("User Fetched")
                                                .data(Map.of("users", this.userService.getById(idLong)))
                                                .build());

        }

        // Post Method

        @PostMapping("/create")
        public ResponseEntity<Response> createUser(@RequestBody User user) {
                return ResponseEntity.ok(
                                Response.builder()
                                                .timeStamp(now())
                                                .status(CREATED)
                                                .statusCode(CREATED.value())
                                                .message("User Created")
                                                .data(Map.of("user", this.userService.create(user)))
                                                .build());

        }

        // Patch

        @PatchMapping("/update/{id}")
        public ResponseEntity<Response> UpdateUser(@RequestBody User user, @PathVariable("id") Long idLong) {
                user.setId(idLong);
                return ResponseEntity.ok(
                                Response.builder()
                                                .timeStamp(now())
                                                .status(OK)
                                                .statusCode(OK.value())
                                                .message("User Updated")
                                                .data(Map.of("user", this.userService.update(user)))
                                                .build());

        }

        // Delete

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Response> deleteUser(@PathVariable("id") Long idLong) {
                this.userService.Delete(idLong);
                return ResponseEntity.ok(
                                Response.builder()
                                                .timeStamp(now())
                                                .status(OK)
                                                .statusCode(OK.value())
                                                .message("User Deleted")
                                                .data(Map.of("IsUserDeleted", true))
                                                .build());

        }
}
