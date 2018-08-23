import java.io.*;
import java.util.*;
class Logo {
	public static int drawTimer = 5;

	public static void drawWelcome () {
		clear();
		for (int i = 0; i <= 100; i++ ) {
			clear();
			System.out.println("					     			     Loading "+ i+ "% ");

			if (i < 10) {
				System.out.println("								\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591");
			}else if (i >= 10 && i < 20) {
				System.out.println("								\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591");
			}else if (i >= 20 && i < 30) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591");
			}else if (i >= 30 && i < 40) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591");
			}else if (i >= 40 && i < 50) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591");
			}else if (i >= 50 && i < 60) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591");
			}else if (i >= 60 && i < 70) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591");
			}else if (i >= 70 && i < 80) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591");
			}else if (i >= 80 && i < 90) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2591\u2591");
			}else if (i >= 90 && i < 100) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591");
			}else if (i == 100) {
				System.out.println("								\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
				stop (9);
				stop (9);

			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			stop(1);
		}
		String line1 = "				 \u2584\u2588     \u2588\u2584     \u2584\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588  \u2584\u2588        \u2584\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588  \u2584\u2588\u2588\u2588\u2588\u2588\u2588\u2584     \u2584\u2584\u2584\u2584\u2588\u2588\u2588\u2584\u2584\u2584\u2584      \u2584\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 ";
		String line2 = "				\u2588\u2588\u2588     \u2588\u2588\u2588   \u2588\u2588\u2588    \u2588\u2588\u2588 \u2588\u2588\u2588       \u2588\u2588\u2588    \u2588\u2588\u2588 \u2588\u2588\u2588    \u2588\u2588\u2588  \u2584\u2588\u2588\u2580\u2580\u2580\u2588\u2588\u2588\u2580\u2580\u2580\u2588\u2588\u2584   \u2588\u2588\u2588    \u2588\u2588\u2588";
		String line3 = "				\u2588\u2588\u2588     \u2588\u2588\u2588   \u2588\u2588\u2588    \u2588\u2580  \u2588\u2588\u2588       \u2588\u2588\u2588    \u2588\u2580  \u2588\u2588\u2588    \u2588\u2588\u2588  \u2588\u2588\u2588   \u2588\u2588\u2588   \u2588\u2588\u2588   \u2588\u2588\u2588    \u2588\u2580 ";
		String line4 = "				\u2588\u2588\u2588     \u2588\u2588\u2588  \u2584\u2588\u2588\u2588\u2584\u2584\u2584     \u2588\u2588\u2588       \u2588\u2588\u2588        \u2588\u2588\u2588    \u2588\u2588\u2588  \u2588\u2588\u2588   \u2588\u2588\u2588   \u2588\u2588\u2588  \u2584\u2588\u2588\u2588\u2584\u2584\u2584    ";
		String line5 = "				\u2588\u2588\u2588     \u2588\u2588\u2588 \u2580\u2580\u2588\u2588\u2588\u2580\u2580\u2580     \u2588\u2588\u2588       \u2588\u2588\u2588        \u2588\u2588\u2588    \u2588\u2588\u2588  \u2588\u2588\u2588   \u2588\u2588\u2588   \u2588\u2588\u2588 \u2580\u2580\u2588\u2588\u2588\u2580\u2580\u2580";
		String line6 = "				\u2588\u2588\u2588     \u2588\u2588\u2588   \u2588\u2588\u2588    \u2588\u2584  \u2588\u2588\u2588       \u2588\u2588\u2588    \u2588\u2584  \u2588\u2588\u2588    \u2588\u2588\u2588  \u2588\u2588\u2588   \u2588\u2588\u2588   \u2588\u2588\u2588   \u2588\u2588\u2588    \u2588\u2584 ";
		String line7 = "				\u2588\u2588\u2588 \u2584\u2588\u2584 \u2588\u2588\u2588   \u2588\u2588\u2588    \u2588\u2588\u2588 \u2588\u2588\u2588\u258C    \u2584 \u2588\u2588\u2588    \u2588\u2588\u2588 \u2588\u2588\u2588    \u2588\u2588\u2588  \u2588\u2588\u2588   \u2588\u2588\u2588   \u2588\u2588\u2588   \u2588\u2588\u2588    \u2588\u2588\u2588 ";
		String line8 = "				 \u2580\u2588\u2588\u2588\u2580\u2588\u2588\u2588\u2580    \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2584\u2584\u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2580   \u2580\u2588\u2588\u2588\u2588\u2588\u2588\u2580    \u2580\u2588   \u2588\u2588\u2588   \u2588\u2580    \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 ";
		String line9 = "				                         \u2580                                                             ";
		clear();
		vAlign();
		System.out.println(line1);
		stop(5);
		System.out.println(line2);
		stop(5);
		System.out.println(line3);
		stop(5);
		System.out.println(line4);
		stop(5);
		System.out.println(line5);
		stop(5);
		System.out.println(line6);
		stop(5);
		System.out.println(line7);
		stop(5);
		System.out.println(line8);
		stop(5);
		System.out.println(line9);
		stop(5);
		stop(9);
		stop(9);
		stop(9);
		stop(9);
		stop(9);
		stop(9);
		stop(9);
		stop(9);
	}
	public static void drawLine () {

		for (int i = 0;i <= ProjectK.screenWidth ;i++ ) {
			System.out.print("\u2550");

		}
		System.out.println("");
	}

	public static  void logoDraw () {
		String k = "\u2588\u2588   \u2588\u2588\r\n\u2588\u2588  \u2588\u2588\r\n\u2588\u2588\u2588\u2588\u2588 \r\n\u2588\u2588  \u2588\u2588 \r\n\u2588\u2588   \u2588\u2588\r\n";
		String kd = "\u2588\u2588   \u2588\u2588   \r\n\u2588\u2588  \u2588\u2588   \r\n\u2588\u2588\u2588\u2588\u2588    \r\n\u2588\u2588  \u2588\u2588     \r\n\u2588\u2588   \u2588\u2588 \u2588\u2588\r\n\r\n           ";
		String kds = "\u2588\u2588   \u2588\u2588        \u2588\u2588\u2588\u2588\u2588\u2588\u2588 \r\n\u2588\u2588  \u2588\u2588         \u2588\u2588 \r\n\u2588\u2588\u2588\u2588\u2588          \u2588\u2588\u2588\u2588\u2588\u2588\u2588\r\n\u2588\u2588  \u2588\u2588              \u2588\u2588\r\n\u2588\u2588   \u2588\u2588 \u2588\u2588     \u2588\u2588\u2588\u2588\u2588\u2588\u2588 ";
		String kdst = "\u2588\u2588   \u2588\u2588        \u2588\u2588\u2588\u2588\u2588\u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\r\n\u2588\u2588  \u2588\u2588         \u2588\u2588         \u2588\u2588\r\n\u2588\u2588\u2588\u2588\u2588          \u2588\u2588\u2588\u2588\u2588\u2588\u2588    \u2588\u2588   \r\n\u2588\u2588  \u2588\u2588              \u2588\u2588    \u2588\u2588  \r\n\u2588\u2588   \u2588\u2588 \u2588\u2588     \u2588\u2588\u2588\u2588\u2588\u2588\u2588    \u2588\u2588  \r\n";
		String kdsto = "\u2588\u2588   \u2588\u2588        \u2588\u2588\u2588\u2588\u2588\u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588\u2588\u2588\u2588\u2588 \r\n\u2588\u2588  \u2588\u2588         \u2588\u2588         \u2588\u2588    \u2588\u2588    \u2588\u2588\r\n\u2588\u2588\u2588\u2588\u2588          \u2588\u2588\u2588\u2588\u2588\u2588\u2588    \u2588\u2588    \u2588\u2588    \u2588\u2588\r\n\u2588\u2588  \u2588\u2588              \u2588\u2588    \u2588\u2588    \u2588\u2588    \u2588\u2588\r\n\u2588\u2588   \u2588\u2588 \u2588\u2588     \u2588\u2588\u2588\u2588\u2588\u2588\u2588    \u2588\u2588     \u2588\u2588\u2588\u2588\u2588\u2588 \r\n                                         ";
		String kdstor = "\u2588\u2588   \u2588\u2588        \u2588\u2588\u2588\u2588\u2588\u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588\u2588\u2588\u2588\u2588\r\n\u2588\u2588  \u2588\u2588         \u2588\u2588         \u2588\u2588    \u2588\u2588    \u2588\u2588 \u2588\u2588   \u2588\u2588\r\n\u2588\u2588\u2588\u2588\u2588          \u2588\u2588\u2588\u2588\u2588\u2588\u2588    \u2588\u2588    \u2588\u2588    \u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2588\r\n\u2588\u2588  \u2588\u2588              \u2588\u2588    \u2588\u2588    \u2588\u2588    \u2588\u2588 \u2588\u2588   \u2588\u2588\r\n\u2588\u2588   \u2588\u2588 \u2588\u2588     \u2588\u2588\u2588\u2588\u2588\u2588\u2588    \u2588\u2588     \u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588   \u2588\u2588 \r\n";
		String kdstore = "\u2588\u2588   \u2588\u2588        \u2588\u2588\u2588\u2588\u2588\u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\r\n\u2588\u2588  \u2588\u2588         \u2588\u2588         \u2588\u2588    \u2588\u2588    \u2588\u2588 \u2588\u2588   \u2588\u2588 \u2588\u2588\r\n\u2588\u2588\u2588\u2588\u2588          \u2588\u2588\u2588\u2588\u2588\u2588\u2588    \u2588\u2588    \u2588\u2588    \u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588\u2588\u2588\u2588 \r\n\u2588\u2588  \u2588\u2588              \u2588\u2588    \u2588\u2588    \u2588\u2588    \u2588\u2588 \u2588\u2588   \u2588\u2588 \u2588\u2588\r\n\u2588\u2588   \u2588\u2588 \u2588\u2588     \u2588\u2588\u2588\u2588\u2588\u2588\u2588    \u2588\u2588     \u2588\u2588\u2588\u2588\u2588\u2588  \u2588\u2588   \u2588\u2588 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\r\n                                                         ";
		String kdstoreS = "\u2588\u2588\u2557  \u2588\u2588\u2557       \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557 \u2588\u2588\u2588\u2588\u2588\u2588\u2557 \u2588\u2588\u2588\u2588\u2588\u2588\u2557 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\r\n\u2588\u2588\u2551 \u2588\u2588\u2554\u255D       \u2588\u2588\u2554\u2550\u2550\u2550\u2550\u255D\u255A\u2550\u2550\u2588\u2588\u2554\u2550\u2550\u255D\u2588\u2588\u2554\u2550\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2550\u2550\u255D\r\n\u2588\u2588\u2588\u2588\u2588\u2554\u255D        \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557   \u2588\u2588\u2551   \u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2588\u2588\u2588\u2557  \r\n\u2588\u2588\u2554\u2550\u2588\u2588\u2557        \u255A\u2550\u2550\u2550\u2550\u2588\u2588\u2551   \u2588\u2588\u2551   \u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u255D  \r\n\u2588\u2588\u2551  \u2588\u2588\u2557\u2588\u2588\u2557    \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2551   \u2588\u2588\u2551   \u255A\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2551  \u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\r\n\u255A\u2550\u255D  \u255A\u2550\u255D\u255A\u2550\u255D    \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D   \u255A\u2550\u255D    \u255A\u2550\u2550\u2550\u2550\u2550\u255D \u255A\u2550\u255D  \u255A\u2550\u255D\u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D\r\n                                                         ";
		String kdstoreSS = "                                            \u2588\u2588\u2557  \u2588\u2588\u2557       \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557 \u2588\u2588\u2588\u2588\u2588\u2588\u2557 \u2588\u2588\u2588\u2588\u2588\u2588\u2557 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\r\n                                            \u2588\u2588\u2551 \u2588\u2588\u2554\u255D       \u2588\u2588\u2554\u2550\u2550\u2550\u2550\u255D\u255A\u2550\u2550\u2588\u2588\u2554\u2550\u2550\u255D\u2588\u2588\u2554\u2550\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2550\u2550\u255D\r\n                                            \u2588\u2588\u2588\u2588\u2588\u2554\u255D        \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557   \u2588\u2588\u2551   \u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2588\u2588\u2588\u2557  \r\n                                            \u2588\u2588\u2554\u2550\u2588\u2588\u2557        \u255A\u2550\u2550\u2550\u2550\u2588\u2588\u2551   \u2588\u2588\u2551   \u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u255D  \r\n                                            \u2588\u2588\u2551  \u2588\u2588\u2557\u2588\u2588\u2557    \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2551   \u2588\u2588\u2551   \u255A\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2551  \u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\r\n                                            \u255A\u2550\u255D  \u255A\u2550\u255D\u255A\u2550\u255D    \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D   \u255A\u2550\u255D    \u255A\u2550\u2550\u2550\u2550\u2550\u255D \u255A\u2550\u255D  \u255A\u2550\u255D\u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D";
		String line7 = "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550";
		int logoTimer = 3;
		String[] LogoSequence = {k,kd,kds,kdst,kdstor,kdstore,kdstoreS,kdstoreSS};
		for(int i = 0;i<8 ; i++){
		drawLine();
		System.out.println(LogoSequence[i]);
		stop(logoTimer);
		clear();
		}
		// drawLine();
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(k);
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(kd);
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(kds);
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(kdst);  
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(kdsto);
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(kdstor);
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(kdstore);
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(kdstoreS);
		// stop(logoTimer);
		// clear();
		// drawLine();
		// System.out.println(kdstoreSS);
		// stop(logoTimer);
		// drawLine();
	}
	public static void stop(int timer) {
		long i = 0;
		while (i <= 100000000 * timer) {
			i++;
		}
	}
	public static void visitAgainPrint () {
		String[] please = {"								","P","l","e","a","s","e"," ","V","i","s","i","t"," ","a","g","a","i","n","  "," ",};
		 for (int i  = 0 ; i <= 20 ;i++ ) {
			stop(3);
			 System.out.print(please[i]);
		 }
	}
	public static void clear(){
	//Clears Screen in java
	try {
		if (System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else{
			new ProcessBuilder("clear").inheritIO().start().waitFor();
		}
	} catch (IOException | InterruptedException ex) {}

	}
	public static void vAlign () {
		for (int i = 1; i<= 17 ;i++ ) {
			System.out.println("");
		}
	}
	public static void exitAnim () {
		String line1N = "                                   \u2584\u2584\u2584\u2588\u2588\u2588\u2588\u2588  \u2588\u2588  \u2588\u2588  \u2584\u2584\u2584       \u2588\u2588\u2588\u2584    \u2588  \u2588\u2588 \u2584\u2588\u2580    \u2588\u2588   \u2588\u2588   \u2588\u2588\u2588\u2588\u2588   \u2588    \u2588\u2588\r";
		String line1B = "                                   \u2584\u2584\u2584\u2588\u2588\u2588\u2588\u2588\u2593 \u2588\u2588\u2591 \u2588\u2588  \u2584\u2584\u2584       \u2588\u2588\u2588\u2584    \u2588  \u2588\u2588 \u2584\u2588\u2580   \u2593\u2588\u2588   \u2588\u2588\u2593 \u2592\u2588\u2588\u2588\u2588\u2588   \u2588    \u2588\u2588 \r";
		String line2N = "                                      \u2588\u2588     \u2588\u2588  \u2588\u2588  \u2588\u2588\u2588\u2588\u2584     \u2588\u2588 \u2580\u2588   \u2588  \u2588\u2588\u2584\u2588       \u2588\u2588  \u2588\u2588  \u2588\u2588   \u2588\u2588  \u2588\u2588   \u2588\u2588 ";
		String line2B = "                                   \u2593  \u2588\u2588\u2592 \u2593\u2592\u2593\u2588\u2588\u2591 \u2588\u2588\u2592\u2592\u2588\u2588\u2588\u2588\u2584     \u2588\u2588 \u2580\u2588   \u2588  \u2588\u2588\u2584\u2588\u2592     \u2592\u2588\u2588  \u2588\u2588\u2592\u2592\u2588\u2588\u2592  \u2588\u2588\u2592 \u2588\u2588  \u2593\u2588\u2588\u2592";
		String line3N = "                                      \u2588\u2588     \u2588\u2588\u2580\u2580\u2588\u2588  \u2588\u2588  \u2580\u2588\u2584   \u2588\u2588  \u2580\u2588 \u2588\u2588  \u2588\u2588\u2588\u2584        \u2588\u2588 \u2588\u2588  \u2588\u2588   \u2588\u2588  \u2588\u2588   \u2588\u2588 ";
		String line3b = "                                   \u2592 \u2593\u2588\u2588\u2591 \u2592\u2591\u2592\u2588\u2588\u2580\u2580\u2588\u2588\u2591\u2592\u2588\u2588  \u2580\u2588\u2584  \u2593\u2588\u2588  \u2580\u2588 \u2588\u2588\u2592\u2593\u2588\u2588\u2588\u2584\u2591      \u2592\u2588\u2588 \u2588\u2588\u2591\u2592\u2588\u2588\u2591  \u2588\u2588\u2592\u2593\u2588\u2588  \u2592\u2588\u2588\u2591";
		String line4N = "                                      \u2588\u2588      \u2588  \u2588\u2588  \u2588\u2588\u2584\u2584\u2584\u2584\u2588\u2588  \u2588\u2588   \u2590\u258C\u2588\u2588  \u2588\u2588 \u2588\u2584        \u2590\u2588\u2588   \u2588\u2588   \u2588\u2588   \u2588   \u2588\u2588 ";
		String line4b = "                                   \u2591 \u2593\u2588\u2588\u2593 \u2591 \u2591\u2593\u2588 \u2591\u2588\u2588 \u2591\u2588\u2588\u2584\u2584\u2584\u2584\u2588\u2588 \u2593\u2588\u2588\u2592  \u2590\u258C\u2588\u2588\u2592\u2593\u2588\u2588 \u2588\u2584      \u2591 \u2590\u2588\u2588\u2593\u2591\u2592\u2588\u2588   \u2588\u2588\u2591\u2593\u2593\u2588  \u2591\u2588\u2588\u2591";
		String line5N = "                                      \u2588\u2588      \u2588  \u2588\u2588   \u2588    \u2588\u2588  \u2588\u2588     \u2588\u2588  \u2588\u2588  \u2588\u2584       \u2588\u2588     \u2588\u2588\u2588\u2588     \u2588\u2588\u2588\u2588\u2588 ";
		String line5b = "                                     \u2592\u2588\u2588\u2592 \u2591 \u2591\u2593\u2588\u2592\u2591\u2588\u2588\u2593 \u2593\u2588   \u2593\u2588\u2588\u2592\u2592\u2588\u2588\u2591   \u2593\u2588\u2588\u2591\u2592\u2588\u2588\u2592 \u2588\u2584     \u2591 \u2588\u2588\u2592\u2593\u2591\u2591 \u2588\u2588\u2588\u2588\u2593\u2592\u2591\u2592\u2592\u2588\u2588\u2588\u2588\u2588\u2593";
		String line6N = "                                                           \u2588                          \u2588\u2588            ";
		String line6b = "                                     \u2592 \u2591\u2591    \u2592 \u2591\u2591\u2592\u2591\u2592 \u2592\u2592   \u2593\u2592\u2588\u2591\u2591 \u2592\u2591   \u2592 \u2592 \u2592 \u2592\u2592 \u2593\u2592      \u2588\u2588\u2592\u2592\u2592 \u2591 \u2592\u2591\u2592\u2591\u2592\u2591 \u2591\u2592\u2593\u2592 \u2592 \u2592";
		String line7N = "                                                                                     \u2588\u2588     ";
		String line7b = "                                       \u2591     \u2592 \u2591\u2592\u2591 \u2591  \u2592   \u2592\u2592 \u2591\u2591 \u2591\u2591   \u2591 \u2592\u2591\u2591 \u2591\u2592 \u2592\u2591    \u2593\u2588\u2588 \u2591\u2592\u2591   \u2591 \u2592 \u2592\u2591 \u2591\u2591\u2592\u2591 \u2591 \u2591 ";
		String line8b = "                                     \u2591       \u2591  \u2591\u2591 \u2591  \u2591   \u2592      \u2591   \u2591 \u2591 \u2591 \u2591\u2591 \u2591     \u2592 \u2592 \u2591\u2591  \u2591 \u2591 \u2591 \u2592   \u2591\u2591\u2591 \u2591 \u2591 ";
		String line9b = "                                             \u2591  \u2591  \u2591      \u2591  \u2591         \u2591 \u2591  \u2591       \u2591 \u2591         \u2591 \u2591     \u2591     ";
		clear();
		vAlign();
		System.out.println(line1N);
		stop(1);
		System.out.println(line2N);
		stop(1);
		System.out.println(line3N);
		stop(1);
		System.out.println(line4N);
		stop(1);
		System.out.println(line5N);
		stop(1);
		System.out.println(line6N);
		stop(1);
		System.out.println(line7N);
		stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2N);
		System.out.println(line3N);
		System.out.println(line4N);
		System.out.println(line5N);
		System.out.println(line6N);
		System.out.println(line7N);
		stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2B);
		System.out.println(line3N);
		System.out.println(line4N);
		System.out.println(line5N);
		System.out.println(line6N);
		System.out.println(line7N);
				stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2B);
		System.out.println(line3b);
		System.out.println(line4N);
		System.out.println(line5N);
		System.out.println(line6N);
		System.out.println(line7N);
				stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2B);
		System.out.println(line3b);
		System.out.println(line4b);
		System.out.println(line5N);
		System.out.println(line6N);
		System.out.println(line7N);
		stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2B);
		System.out.println(line3b);
		System.out.println(line4b);
		System.out.println(line5b);
		System.out.println(line6N);
		System.out.println(line7N); 
		stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2B);
		System.out.println(line3b);
		System.out.println(line4b);
		System.out.println(line5b);
		System.out.println(line6b);
		System.out.println(line7N);
		stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2B);
		System.out.println(line3b);
		System.out.println(line4b);
		System.out.println(line5b);
		System.out.println(line6b);
		System.out.println(line7b);
		stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2B);
		System.out.println(line3b);
		System.out.println(line4b);
		System.out.println(line5b);
		System.out.println(line6b);
		System.out.println(line7b);
		System.out.println(line8b);
		stop(drawTimer);
		clear();
		vAlign();
		System.out.println(line1B);
		System.out.println(line2B);
		System.out.println(line3b);
		System.out.println(line4b);
		System.out.println(line5b);
		System.out.println(line6b);
		System.out.println(line7b);
		System.out.println(line8b);
		System.out.println(line9b); 
		visitAgainPrint();       
	}

}


