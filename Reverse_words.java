package javaprojects;

public class Reverse_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="hii welcome to java programming";
		String[] words=sentence.split(" ");
		StringBuilder reverseSentence=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			reverseSentence.append(words[i]).append(" ");
		}
		System.out.println("Reverse the strings : "+ reverseSentence);

	}

}
