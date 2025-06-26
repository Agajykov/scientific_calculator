package Model;

import java.util.ArrayList;
import java.util.List;

public class HistoryModel {

	private List<History> historyList = new ArrayList<>();

	public void addHistory(String expression, double result) {
		historyList.add(new History(expression, result));
	}

	public List<History> getHistoryList() {
		return historyList;
	}

}
