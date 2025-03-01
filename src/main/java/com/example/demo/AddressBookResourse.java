package com.example.demo;



import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
@RestController
@RequestMapping("/api/v1")
@Tag(name = "AddressBook APIs", description = "get, getAll, add")
public class AddressBookResourse {



    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();
    @Operation(
            summary = "Retrieve by ID",
            description = "Retrieves its identifier.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
                    @ApiResponse(responseCode = "404", description = "Not found")
            }
    )
    @GetMapping("/{id}")
    public Contact getContact( @Parameter(description = "The ID to retrieve") @PathVariable String id){
        return contacts.get(id);

    }
    @GetMapping("/")
    public List<Contact> getAllContacts(){
        return new ArrayList<Contact>(contacts.values());

    }
    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact){
    contacts.put(contact.getId(), contact);
    return  contact;

    }

}
