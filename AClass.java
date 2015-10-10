package com.sestoelemento.skywars;

import java.util.ArrayList;

import org.bukkit.inventory.ItemStack;

public class AClass {
	
	@SuppressWarnings("unused")
	private Main m;
	public String name;
	public ArrayList<ItemStack> items = new ArrayList<ItemStack>();
	
	public AClass(Main m, String name, ArrayList<ItemStack> items){
		this.m = m;
		this.name = name;
		this.items = items;
	}
	
	public ItemStack[] getItems(){
		ItemStack[] ret = new ItemStack[items.size()];
		int c = 0;
		for(ItemStack f : items){
			ret[c] = f;
			c++;
		}
		return ret;
	}

}
