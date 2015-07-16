
package com.java.learning.greg.months;

	
public enum MonthsInYear {
	January (1),
	February (2),
	March (3),
	April (4),
	May (5),
	June (6),
	July (7),
	August (8),
	September (9),
	October (10),
	November (11),
	December (12);

	private int monthNumber;

	/**
	 * Private Constructor - because *ONLY* the MonthsInYear enum can create itself.
	 * @param monthNumber
	 */
	private MonthsInYear (int monthNumber) {
		this.monthNumber = monthNumber;
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	/**
	 * Method to get a month for the provided month number.
	 * @param monthNumber What month do you want?
	 * @return The MonthsInYear object for the month you provide, or null if you provide an invalid month.
	 */
	public static MonthsInYear getMonthByNumber(int monthNumber) {
//		return getMonthByNumberUsingSwitch(monthNumber);
		return getMonthByNumberUsingLessTyping(monthNumber);
	}

	/**
	 * This is a more efficient way of doing it (saves a lot of keystrokes).
	 */
	protected static MonthsInYear getMonthByNumberUsingLessTyping(int monthNumber) {
		for(MonthsInYear month : MonthsInYear.values()) {
			if(month.getMonthNumber()==monthNumber) {
				return month;
			}
		}
		return null;
	}

	/**
	 * This is how the teacher wanted it done (using switches)
	 */
	protected static MonthsInYear getMonthByNumberUsingSwitch(int monthNumber) {
		MonthsInYear theMonth = null;

		// Method 1: Switch Statement
		switch(monthNumber) {
			case 1: {
				theMonth = January;
				break;
			}

			case 2: {
				theMonth = February;
				break;
			}

			case 3: {
				theMonth = March;
				break;
			}

			case 4: {
				theMonth = April;
				break;
			}

			case 5: {
				theMonth = May;
				break;
			}

			case 6: {
				theMonth = June;
				break;
			}

			case 7: {
				theMonth = July;
				break;
			}

			case 8: {
				theMonth = August;
				break;
			}

			case 9: {
				theMonth = September;
				break;
			}

			case 10: {
				theMonth = October;
				break;
			}

			case 11: {
				theMonth = November;
				break;
			}

			case 12: {
				theMonth = December;
				break;
			}

			default: {
				theMonth = null;
				break;
			}
		}

		return theMonth;
	}
}
