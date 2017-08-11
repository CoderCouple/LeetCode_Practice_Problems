package Arrays;

import java.lang.reflect.Array;

public class CanPlaceFlowers {

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;

		if (flowerbed.length < 1)
			return false;

		if (flowerbed.length == 1 && flowerbed[0] == 0)
			count++;

		for (int i = 0; i < flowerbed.length;) {
			if (i == 0 && flowerbed.length > 1)
				if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
					i = i + 2;
					count++;
					continue;
				}

			if (flowerbed.length > 2 && i > 0 && i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i + 1] == 0
					&& flowerbed[i - 1] == 0) {
				count++;
				i = i + 2;
				continue;
			}

			if (i == flowerbed.length - 1 && flowerbed.length > 1)
				if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
					count++;
					i = i + 2;
					continue;
				}

			i++;

		}
		return n <= count;

	}

	public static void main(String[] args) {
		int array[] = { 1, 0, 0, 0, 1 };
		int k = 1;
		System.out.println(canPlaceFlowers(array, k));

	}

}
