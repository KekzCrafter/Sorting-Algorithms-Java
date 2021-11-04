package de.kekz.algorithms.types;

import java.util.ArrayList;

import de.kekz.algorithms.Algorithm;
import de.kekz.algorithms.enums.AlgorithmType;

public class BubbleSort extends Algorithm {

	public BubbleSort() {
		super(AlgorithmType.BUBBLE);
	}

	@Override
	public ArrayList<Double> sort() {

		/* Copy cached list */
		ArrayList<Double> list = new ArrayList<>();
		list.addAll(getListToSort());

		int i = 0, length = list.size();

		/* Repeat as long the complete list wasn't checked */
		while (i < length) {

			/* Compare all items */
			for (int j = 0; j < length - 1; j++) {
				double first = list.get(j), compare = list.get(j + 1);

				/* Switch places if first is higher than next item */
				if (compare <= first) {
					list.set(j, compare);
					list.set(j + 1, first);
				}
			}

			i++;
		}

		return list;
	}
}