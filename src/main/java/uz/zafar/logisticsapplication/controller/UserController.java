package uz.zafar.logisticsapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.zafar.logisticsapplication.db.domain.User;
import uz.zafar.logisticsapplication.db.service.UserService;
import uz.zafar.logisticsapplication.dto.ResponseDto;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public ResponseDto<Page<User>> getAllUsers(@RequestParam int page , @RequestParam int size, @RequestParam String role) {
        return userService.findAllByRole(role, page, size);
    }
}
