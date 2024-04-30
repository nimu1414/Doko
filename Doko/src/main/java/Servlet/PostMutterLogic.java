package Servlet;

import java.util.List;

import model.Mutter;



public class PostMutterLogic {
	public void execute(Mutter mutter,List<Mutter> mutterList) {
		mutterList.add(0,mutter);
	}

}
