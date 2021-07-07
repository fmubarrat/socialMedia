package com.project.fayek.socialMedia.Service;

import lombok.AllArgsConstructor;
import lombok.Data;

/* @author : fayek.mubarrat
 * date : 07/07/2021
 * purpose : To implement AuthenticationResponse */

/* Lombok is used instead of getter & setter*/

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    private String authenticationToken;
    private String username;
}
