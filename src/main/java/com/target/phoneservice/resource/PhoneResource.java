package com.target.phoneservice.resource;

import com.target.phoneservice.domain.Phone;
import com.target.phoneservice.service.PhoneService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/phone")
public class PhoneResource {

    private PhoneService service;

    @GetMapping("/number/{number}")
    public ResponseEntity<Phone> getPhoneByNumber(@PathVariable Long number) {
        return new ResponseEntity<>(service.getPhoneByNumber(number), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Phone>> postPhone(@Valid @RequestBody List<Phone> phoneList) {
        return new ResponseEntity<>(service.save(phoneList), HttpStatus.OK);
    }
}
