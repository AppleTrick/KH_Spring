package com.test02;

public class MyFood {
	
	private Food favoriteFood;
	private Food urFavoriteFood;
	public MyFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyFood(Food favoriteFood, Food urFavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.urFavoriteFood = urFavoriteFood;
	}
	public Food getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public Food getUrFavoriteFood() {
		return urFavoriteFood;
	}
	public void setUrFavoriteFood(Food urFavoriteFood) {
		this.urFavoriteFood = urFavoriteFood;
	}
	@Override
	public String toString() {
		return "favorite : " + favoriteFood + "\nunfavorite : " + urFavoriteFood;
	}
	
	
}
