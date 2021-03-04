package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.ui.UI;

public class Board {

	char[][] matrix;

	public Board() {
		matrix = new char [Constants.BOARD_SIZE][Constants.BOARD_SIZE];
		clear();
	}



	public void clear() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
	}

	public void print() {
		UI.printNewLine();

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));
				if(j < matrix[i].length - 1) {
					UI.printTextWithNoNewLine(" | ");
				}

			}
			UI.printNewLine();
			if(i < matrix.length - 1) {
				UI.printText("---------------------");

			}
		}

	}

	public boolean isFull(){

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == ' ') {
					return false;
				}
			}
		}

		return true;
	}

	public boolean play(Player player, Move move) {
		int i = move.getI();
		int j = move.getJ();
		
		matrix[i][j] = player.getSymbol();
		
		//TODO Checar se o jogador ganhou
		return false;
	}
	
	public boolean checkRows(Player player) {
		char symbol = player.getSymbol();
		for(int i = 0; i < Constants.BOARD_SIZE; i++) {
			if(checkRow(player)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkRow(Player player) {
		char symbol = player.getSymbol();
		int aux = 0;
		
		for(int j =0; j < Constants.BOARD_SIZE; j++) {
			if(matrix[aux][j] != symbol) {
				return false;
			}
		}
		return true;
	}
}
