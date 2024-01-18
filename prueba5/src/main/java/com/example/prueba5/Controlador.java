package com.example.prueba5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @PostMapping("/manipulateStringArray")
    public String manipulateStringArray(@RequestBody String[] inputArray) {        
        String result = manipulateStrings(inputArray);
        System.out.println(result);
        return result;
    }
    /*@GetMapping("/") -- Esto fue para probar que la config este bien.
    public String pruebasconexion() {
        return "HOLA";
    } */

    private String manipulateStrings(String[] inputArray) {
        StringBuilder resultBuilder = new StringBuilder();

        for (String str : inputArray) {            
            resultBuilder.append(str.toLowerCase()).append(" ");
        }
        return resultBuilder.toString().trim();
    }
}
