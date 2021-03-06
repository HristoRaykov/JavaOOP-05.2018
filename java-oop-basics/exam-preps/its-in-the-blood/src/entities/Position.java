package entities;

public class Position {
	
	private int row;
	
	private int column;
	
	public Position() {
	}
	
	public Position(int row, int column) {
		setRow(row);
		setColumn(column);
	}
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
}
