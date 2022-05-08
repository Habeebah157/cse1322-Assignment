import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class Encryption {
    ArrayList<Character> symbols = new ArrayList<Character>();
    ArrayList<Character> alphabets = new ArrayList<Character>();
    public Encryption(){
        symbols.add('!');
        symbols.add('@');
        symbols.add('#');
        symbols.add('$');
        symbols.add('^');
        symbols.add('&');
        symbols.add('*');
        symbols.add('(');
        symbols.add(')');
        symbols.add('_');
        symbols.add('-');
        symbols.add('+');
        symbols.add('=');
        symbols.add('?');
        symbols.add(',');
        symbols.add('{');
        symbols.add('}');
        symbols.add('[');
        symbols.add(']');
        symbols.add('/');
        symbols.add('|');
        symbols.add(';');
        symbols.add(':');
        symbols.add('.');
        symbols.add('<');
        symbols.add('>');
        for(char letter='a';letter<='z';letter++) {
            alphabets.add(letter);
        }
    }
    public char return_alphabet(int num){
        return alphabets.get(num);
    }
    public int return_alphabet_index(char c){
       return alphabets.indexOf(c);
    }
    public char return_symbol(int num){
        return symbols.get(num);
    }
    public int return_symbol_index(char sym){
        return symbols.indexOf(sym);
    }
    public String encrypt_message(String text){
        String result = "";
        String lower = text.toLowerCase();
       char[] encrypt = lower.toCharArray();
       for(int i = 0; i<encrypt.length; i++){
         result = result + String.valueOf(return_symbol(return_alphabet_index(encrypt[i])));
       }


       return result;
    }
    private boolean linear_search(List<Character> x, char target){
        for (int i = 0; i<x.size(); i++){
            if (x.get(i) == target){
                return true;
            }
        }
        return false;
    }
    public String decrypt_message(String text){
        int flag = 0;
        String result = "";
        char[] decrypt= text.toCharArray();
        for (int i = 0; i< decrypt.length; i++){

            if(linear_search(symbols, decrypt[i])== true){
                result = result + String.valueOf(return_alphabet(return_symbol_index(decrypt[i])));
            }else {
                return "Error:Invalid Symbol";
            }
//            change symbol to number and then number to symbol
        }

        return result;
    }
    }
