package br.com.softblue.tictactoe.core;

public class Move {
	private int i;
	private int j;
	
	public Move(String moveStr) {
		String[] tokens = moveStr.split(",");
		
		
		this.i = Integer.parseInt(tokens[0]);
		this.j = Integer.parseInt(tokens[1]);
		
		//TODO validar se o que foi digitado como cordenadas está correto
	}
	
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}


	
}
