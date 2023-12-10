package com.pe.relari.execute;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryption {

    public static String encrypt(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] byteData = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte byteDatum : byteData) {
            sb.append(Integer.toString((byteDatum & 0xff) + 0x100, 16).substring(1));
        }
        String encryptedPassword = sb.toString();
        System.out.println("Contraseña encriptada: " + encryptedPassword);

        return encryptedPassword;
    }


    public static void main(String[] args) throws NoSuchAlgorithmException {
        encrypt("Renzo");
        encrypt("Renzo");
        System.out.println(encrypt("Renzo").length());
    }
}
