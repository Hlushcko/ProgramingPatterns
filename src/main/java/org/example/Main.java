package org.example;


import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {


    public static void main(String[] args) throws Exception {

        System.out.println(encodeURL("ab14243fdf826feed63d492a91b795ac0f5e00e6".toCharArray()));

    }


    public static String encodeURL(char[] element) throws Exception {
        StringBuilder result = new StringBuilder();

        if(element.length % 2 != 0){
            throw new Exception("An item cannot be divided into an equal number of elements");
        }

        for(int i = 0; i < element.length; i++){
            result.append(encode( String.valueOf(element[i++]) + element[i]));
        }

        return result.toString();
    }

    private static String encode(String sumChar){

        switch (sumChar){
            case "2d":
            case "2D": return "-";
            case "2E":
            case "2e": return ".";
            case "5F":
            case "5f": return "_";
            case "7E":
            case "7e": return "~";
            case "41": return "A";
            case "42": return "B";
            case "43": return "C";
            case "44": return "D";
            case "45": return "E";
            case "46": return "F";
            case "47": return "G";
            case "48": return "H";
            case "49": return "I";
            case "4A":
            case "4a": return "J";
            case "4B":
            case "4b": return "K";
            case "4C":
            case "4c": return "L";
            case "4D":
            case "4d": return "M";
            case "4E":
            case "4e": return "N";
            case "4F":
            case "4f": return "O";
            case "50": return "P";
            case "51": return "Q";
            case "52": return "R";
            case "53": return "S";
            case "54": return "T";
            case "55": return "U";
            case "56": return "V";
            case "57": return "W";
            case "58": return "X";
            case "59": return "Y";
            case "5A":
            case "5a": return "Z";
            case "61": return "a";
            case "62": return "b";
            case "63": return "c";
            case "64": return "d";
            case "65": return "e";
            case "66": return "f";
            case "67": return "g";
            case "68": return "h";
            case "69": return "i";
            case "6A":
            case "6a": return "j";
            case "6B":
            case "6b": return "k";
            case "6C":
            case "6c": return "l";
            case "6D":
            case "6d": return "m";
            case "6E":
            case "6e": return "n";
            case "6F":
            case "6f": return "o";
            case "70": return "p";
            case "71": return "q";
            case "72": return "r";
            case "73": return "s";
            case "74": return "t";
            case "75": return "u";
            case "76": return "v";
            case "77": return "w";
            case "78": return "x";
            case "79": return "y";
            case "7A":
            case "7a": return "z";

            default: return "%" + sumChar;
        }

    }

}
