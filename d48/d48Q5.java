class d48Q5 {
		public static void main(String[] args) {
				int[] numbers = new int[args.length];

				for (int i = 0; i < args.length; i++) {
						numbers[i] = Integer.parseInt(args[i]);
				}

				for (int nextMinIndex = 0; nextMinIndex < numbers.length - 1; nextMinIndex++) {
						int minIndex = nextMinIndex;
						int minValue = numbers[nextMinIndex];
						for (int checkIndex = nextMinIndex + 1;
								checkIndex < numbers.length; checkIndex++) {
							if (numbers[checkIndex] < minValue) {
								minIndex = checkIndex;
								minValue = numbers[minIndex];
							}
						}

						int t;
						t = numbers[nextMinIndex];
						numbers[nextMinIndex] = numbers[minIndex];
						numbers[minIndex] = t;
				}

				for (int n : numbers) {
						System.out.print(n + " ");
				}
		}
}

