package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.ui.UI;

public class Player {
	
	private String name;
	private Board board;
	private char symbol;
	
	public Player(String name, Board board, char symbol) {
		this.name = name;
		this.board = board;
		this.symbol = symbol;
	}
	
	public String getName() {
		return name;
	}

	public Board getBoard() {
		return board;
	}

	public char getSymbol() {
		return symbol;
	}

	private Move inputMove() {
		String moveStr = UI.readInput("Jogador " + name + " =>");
		return new Move(moveStr);
		
	}
	
	public void play() {
		Move move = inputMove();
		board.play(this, move);
		}
	}
