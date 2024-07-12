
1 package hotel;
2
3 import java.awt.EventQueue;
28
29 public class Hotel {
30
31 private JFrame frame;
32 private JTextField txtDisplay;
33 private JTextField txtFriedRice;
34 private JTextField txtShawarma;
35 private JTextField txtChicken;
36 private JTextField txtChooseDrink;
37 private JTextField txtEnterCurrency;
38
39 double firstnum;
40 double secondnum;
41 double result;
42 String operations;
43 String answer;
44
45 double Nigerian_Naira = 360.00;
46 double Kenyan_Shilling = 101.00;
47 double Chinese_Yuan = 6.29;
48 double Indian_Rupee = 65.02;
49
50 private JLabel lblClock;
51
52 /**
53 * Launch the application.
54 */
55 public static void main(String[] args) {
56 EventQueue.invokeLater(new Runnable() {
57 public void run() {
58 try {
59 Hotel window = new Hotel();
60 window.frame.setVisible(true);
61 } catch (Exception e) {
62 e.printStackTrace();
63 }
64 }
65 });
66 }
67
68 public void datetime()
69 {
70 Thread datetime = new Thread()
71 {
72 public void run()
73 {
74 try
75 {
76 for(;;)
77 {
78 Calendar cal = new GregorianCalendar();
79 int day = cal.get(Calendar.DAY_OF_MONTH);
80 int month = cal.get(Calendar.MONTH);
81 int year = cal.get(Calendar.YEAR);

Hotel.java
82 
83 int second = cal.get(Calendar.SECOND);
84 int minute = cal.get(Calendar.MINUTE);
85 int hour = cal.get(Calendar.HOUR);
86 
87 lblClock.setText("Time: " + hour + ":" + minute + ":" + 
second + " " + year + "/" + month + "/" + day);
88 
89 sleep(1000);
90 }
91 }
92 catch(Exception e)
93 {
94 
95 }
96 }
97 };
98 datetime.start();
99 }
100
101 /**
102 * Create the application.
103 */
104 public Hotel() {
105 initialize();
106 datetime();
107 }
108
109 /**
110 * Initialize the contents of the frame.
111 */
112 private void initialize() {
113 frame = new JFrame();
114 frame.setBounds(0, 0, 1500, 800);
115 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
116 frame.getContentPane().setLayout(null);
117
118 JPanel panel = new JPanel();
119 panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
120 panel.setBounds(10, 51, 479, 707);
121 frame.getContentPane().add(panel);
122 panel.setLayout(null);
123
124 JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
125 tabbedPane.setBounds(10, 10, 459, 687);
126 panel.add(tabbedPane);
127
128 JPanel panel_3 = new JPanel();
129 tabbedPane.addTab("Calculator", null, panel_3, null);
130 panel_3.setLayout(null);
131
132 txtDisplay = new JTextField();
133 txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
134 txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 60));
135 txtDisplay.setColumns(10);
136 txtDisplay.setBounds(10, 24, 430, 60);
137 panel_3.add(txtDisplay);
Page 2
Hotel.java
138
139 JButton btnbackspace = new JButton("\uF0E7");
140 btnbackspace.addActionListener(new ActionListener() {
141 public void actionPerformed(ActionEvent arg0) {
142
143 if(txtDisplay.getText().length()>0)
144 {
145 String backspace = null;
146
147 StringBuilder strB = new StringBuilder(txtDisplay.getText());
148 strB.deleteCharAt(txtDisplay.getText().length()-1);
149 backspace = strB.toString();
150 txtDisplay.setText(backspace);
151 }
152
153 }
154 });
155 btnbackspace.setFont(new Font("Dialog", Font.BOLD, 50));
156 btnbackspace.setBounds(10, 94, 100, 100);
157 panel_3.add(btnbackspace);
158
159 JButton btn7 = new JButton("7");
160 btn7.addActionListener(new ActionListener() {
161 public void actionPerformed(ActionEvent arg0) {
162
163 String EnterValue = txtDisplay.getText() + btn7.getText();
164 txtDisplay.setText(EnterValue);
165
166 }
167 });
168 btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
169 btn7.setBounds(10, 204, 100, 100);
170 panel_3.add(btn7);
171
172 JButton btn4 = new JButton("4");
173 btn4.addActionListener(new ActionListener() {
174 public void actionPerformed(ActionEvent arg0) {
175
176 String EnterValue = txtDisplay.getText() + btn4.getText();
177 txtDisplay.setText(EnterValue);
178
179 }
180 });
181 btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
182 btn4.setBounds(10, 314, 100, 100);
183 panel_3.add(btn4);
184
185 JButton btn1 = new JButton("1");
186 btn1.addActionListener(new ActionListener() {
187 public void actionPerformed(ActionEvent arg0) {
188
189 String EnterValue = txtDisplay.getText() + btn1.getText();
190 txtDisplay.setText(EnterValue);
191
192 }
193 });
194 btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
Page 3
Hotel.java
195 btn1.setBounds(10, 424, 100, 100);
196 panel_3.add(btn1);
197
198 JButton btn0 = new JButton("0");
199 btn0.addActionListener(new ActionListener() {
200 public void actionPerformed(ActionEvent arg0) {
201
202 String EnterValue = txtDisplay.getText() + btn0.getText();
203 txtDisplay.setText(EnterValue);
204
205 }
206 });
207 btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
208 btn0.setBounds(10, 534, 100, 100);
209 panel_3.add(btn0);
210
211 JButton btnDot = new JButton(".");
212 btnDot.addActionListener(new ActionListener() {
213 public void actionPerformed(ActionEvent arg0) {
214
215 String EnterValue = txtDisplay.getText() + btnDot.getText();
216 txtDisplay.setText(EnterValue);
217
218 }
219 });
220 btnDot.setFont(new Font("Tahoma", Font.BOLD, 70));
221 btnDot.setBounds(120, 534, 100, 100);
222 panel_3.add(btnDot);
223
224 JButton btn2 = new JButton("2");
225 btn2.addActionListener(new ActionListener() {
226 public void actionPerformed(ActionEvent arg0) {
227
228 String EnterValue = txtDisplay.getText() + btn2.getText();
229 txtDisplay.setText(EnterValue);
230
231 }
232 });
233 btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
234 btn2.setBounds(120, 424, 100, 100);
235 panel_3.add(btn2);
236
237 JButton btn5 = new JButton("5");
238 btn5.addActionListener(new ActionListener() {
239 public void actionPerformed(ActionEvent arg0) {
240
241 String EnterValue = txtDisplay.getText() + btn5.getText();
242 txtDisplay.setText(EnterValue);
243
244 }
245 });
246 btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
247 btn5.setBounds(120, 314, 100, 100);
248 panel_3.add(btn5);
249
250 JButton btn8 = new JButton("8");
251 btn8.addActionListener(new ActionListener() {
Page 4
Hotel.java
252 public void actionPerformed(ActionEvent arg0) {
253
254 String EnterValue = txtDisplay.getText() + btn8.getText();
255 txtDisplay.setText(EnterValue);
256
257 }
258 });
259 btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
260 btn8.setBounds(120, 204, 100, 100);
261 panel_3.add(btn8);
262
263 JButton btnclear = new JButton("C");
264 btnclear.addActionListener(new ActionListener() {
265 public void actionPerformed(ActionEvent arg0) {
266
267 txtDisplay.setText(null);
268
269 }
270 });
271 btnclear.setFont(new Font("Tahoma", Font.BOLD, 70));
272 btnclear.setBounds(120, 94, 100, 100);
273 panel_3.add(btnclear);
274
275 JButton btnmodulus = new JButton("%");
276 btnmodulus.addActionListener(new ActionListener() {
277 public void actionPerformed(ActionEvent arg0) {
278
279 firstnum = Double.parseDouble(txtDisplay.getText());
280 txtDisplay.setText("");
281 operations = "%";
282
283 }
284 });
285 btnmodulus.setFont(new Font("Tahoma", Font.BOLD, 50));
286 btnmodulus.setBounds(230, 94, 100, 100);
287 panel_3.add(btnmodulus);
288
289 JButton btn9 = new JButton("9");
290 btn9.addActionListener(new ActionListener() {
291 public void actionPerformed(ActionEvent arg0) {
292
293 String EnterValue = txtDisplay.getText() + btn9.getText();
294 txtDisplay.setText(EnterValue);
295
296 }
297 });
298 btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
299 btn9.setBounds(230, 204, 100, 100);
300 panel_3.add(btn9);
301
302 JButton btn6 = new JButton("6");
303 btn6.addActionListener(new ActionListener() {
304 public void actionPerformed(ActionEvent arg0) {
305
306 String EnterValue = txtDisplay.getText() + btn6.getText();
307 txtDisplay.setText(EnterValue);
308
Page 5
Hotel.java
309 }
310 });
311 btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
312 btn6.setBounds(230, 314, 100, 100);
313 panel_3.add(btn6);
314
315 JButton btn3 = new JButton("3");
316 btn3.addActionListener(new ActionListener() {
317 public void actionPerformed(ActionEvent arg0) {
318
319 String EnterValue = txtDisplay.getText() + btn3.getText();
320 txtDisplay.setText(EnterValue);
321
322 }
323 });
324 btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
325 btn3.setBounds(230, 424, 100, 100);
326 panel_3.add(btn3);
327
328 JButton btnplusminus = new JButton("\u00B1");
329 btnplusminus.addActionListener(new ActionListener() {
330 public void actionPerformed(ActionEvent arg0) {
331
332 double plusminus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
333 plusminus = plusminus*(-1);
334 txtDisplay.setText(String.valueOf(plusminus));
335
336 }
337 });
338 btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 70));
339 btnplusminus.setBounds(230, 534, 100, 100);
340 panel_3.add(btnplusminus);
341
342 JButton btnequal = new JButton("=");
343 btnequal.addActionListener(new ActionListener() {
344 public void actionPerformed(ActionEvent arg0) {
345
346 String answer;
347 
348 secondnum = Double.parseDouble(txtDisplay.getText());
349 
350 if(operations == "+")
351 {
352 result = firstnum + secondnum;
353 answer = String.format("%.2f", result);
354 txtDisplay.setText(answer);
355 }
356 else if(operations == "-")
357 {
358 result = firstnum - secondnum;
359 answer = String.format("%.2f", result);
360 txtDisplay.setText(answer);
361 }
362 else if(operations == "X")
363 {
364 result = firstnum * secondnum;
365 answer = String.format("%.2f", result);
Page 6
Hotel.java
366 txtDisplay.setText(answer);
367 }
368 else if(operations == "/")
369 {
370 result = firstnum / secondnum;
371 answer = String.format("%.2f", result);
372 txtDisplay.setText(answer);
373 }
374 else if(operations == "%")
375 {
376 result = firstnum % secondnum;
377 answer = String.format("%.2f", result);
378 txtDisplay.setText(answer);
379 }
380
381 }
382 });
383 btnequal.setFont(new Font("Tahoma", Font.BOLD, 70));
384 btnequal.setBounds(340, 534, 100, 100);
385 panel_3.add(btnequal);
386
387 JButton btndivide = new JButton("/");
388 btndivide.addActionListener(new ActionListener() {
389 public void actionPerformed(ActionEvent arg0) {
390
391 firstnum = Double.parseDouble(txtDisplay.getText());
392 txtDisplay.setText("");
393 operations = "/";
394
395 }
396 });
397 btndivide.setFont(new Font("Tahoma", Font.BOLD, 70));
398 btndivide.setBounds(340, 424, 100, 100);
399 panel_3.add(btndivide);
400
401 JButton btnx = new JButton("X");
402 btnx.addActionListener(new ActionListener() {
403 public void actionPerformed(ActionEvent arg0) {
404
405 firstnum = Double.parseDouble(txtDisplay.getText());
406 txtDisplay.setText("");
407 operations = "X";
408
409 }
410 });
411 btnx.setFont(new Font("Tahoma", Font.BOLD, 70));
412 btnx.setBounds(340, 314, 100, 100);
413 panel_3.add(btnx);
414
415 JButton btnminus = new JButton("-");
416 btnminus.addActionListener(new ActionListener() {
417 public void actionPerformed(ActionEvent arg0) {
418
419 firstnum = Double.parseDouble(txtDisplay.getText());
420 txtDisplay.setText("");
421 operations = "-";
422
Page 7
Hotel.java
423 }
424 });
425 btnminus.setFont(new Font("Tahoma", Font.BOLD, 70));
426 btnminus.setBounds(340, 204, 100, 100);
427 panel_3.add(btnminus);
428
429 JButton btnPlus = new JButton("+");
430 btnPlus.addActionListener(new ActionListener() {
431 public void actionPerformed(ActionEvent arg0) {
432
433 firstnum = Double.parseDouble(txtDisplay.getText());
434 txtDisplay.setText("");
435 operations = "+";
436
437 }
438 });
439 btnPlus.setFont(new Font("Tahoma", Font.BOLD, 70));
440 btnPlus.setBounds(340, 94, 100, 100);
441 panel_3.add(btnPlus);
442
443 JPanel panel_4 = new JPanel();
444 tabbedPane.addTab("Receipt", null, panel_4, null);
445 panel_4.setLayout(null);
446
447 JTextArea ReceiptArea = new JTextArea();
448 ReceiptArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
449 ReceiptArea.setBounds(10, 10, 434, 640);
450 panel_4.add(ReceiptArea);
451
452 JPanel panel_1 = new JPanel();
453 panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
454 panel_1.setBounds(492, 134, 982, 362);
455 frame.getContentPane().add(panel_1);
456 panel_1.setLayout(null);
457
458 JLabel lblMenu = new JLabel("Menu");
459 lblMenu.setBounds(22, 21, 119, 31);
460 lblMenu.setForeground(Color.BLUE);
461 lblMenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
462 panel_1.add(lblMenu);
463
464 JLabel lblQty = new JLabel("Qty");
465 lblQty.setBounds(278, 21, 119, 31);
466 lblQty.setForeground(Color.BLUE);
467 lblQty.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
468 panel_1.add(lblQty);
469
470 JLabel lblPrice = new JLabel("Price $");
471 lblPrice.setBounds(483, 21, 119, 31);
472 lblPrice.setForeground(Color.BLUE);
473 lblPrice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
474 panel_1.add(lblPrice);
475
476 JLabel btnFriedRice = new JLabel("Fried Rice");
477 btnFriedRice.setBounds(22, 62, 143, 31);
478 btnFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
479 panel_1.add(btnFriedRice);
Page 8
Hotel.java
480
481 JLabel btnShawarma = new JLabel("Shawarma");
482 btnShawarma.setBounds(22, 103, 143, 31);
483 btnShawarma.setFont(new Font("Tahoma", Font.PLAIN, 25));
484 panel_1.add(btnShawarma);
485
486 JLabel btnChicken = new JLabel("Chicken");
487 btnChicken.setBounds(22, 144, 143, 31);
488 btnChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
489 panel_1.add(btnChicken);
490
491 txtFriedRice = new JTextField();
492 txtFriedRice.setBounds(278, 62, 119, 31);
493 txtFriedRice.setFont(new Font("Tahoma", Font.BOLD, 20));
494 panel_1.add(txtFriedRice);
495 txtFriedRice.setColumns(10);
496
497 txtShawarma = new JTextField();
498 txtShawarma.setBounds(278, 103, 119, 31);
499 txtShawarma.setFont(new Font("Tahoma", Font.BOLD, 20));
500 txtShawarma.setColumns(10);
501 panel_1.add(txtShawarma);
502
503 txtChicken = new JTextField();
504 txtChicken.setBounds(278, 144, 119, 31);
505 txtChicken.setFont(new Font("Tahoma", Font.BOLD, 20));
506 txtChicken.setColumns(10);
507 panel_1.add(txtChicken);
508
509 JLabel label = new JLabel("5.676");
510 label.setBounds(483, 62, 143, 31);
511 label.setFont(new Font("Tahoma", Font.PLAIN, 25));
512 panel_1.add(label);
513
514 JLabel label_1 = new JLabel("3.987");
515 label_1.setBounds(483, 103, 143, 31);
516 label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
517 panel_1.add(label_1);
518
519 JLabel label_2 = new JLabel("11.452");
520 label_2.setBounds(483, 144, 143, 31);
521 label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
522 panel_1.add(label_2);
523
524 JComboBox btnChooseDrink = new JComboBox();
525 btnChooseDrink.setBounds(22, 185, 207, 38);
526 btnChooseDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
527 btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", 
"Coca Cola", "Heineken", "Pepsi"}));
528 panel_1.add(btnChooseDrink);
529
530 txtChooseDrink = new JTextField();
531 txtChooseDrink.setBounds(278, 192, 119, 31);
532 txtChooseDrink.setFont(new Font("Tahoma", Font.BOLD, 20));
533 txtChooseDrink.setColumns(10);
534 panel_1.add(txtChooseDrink);
535
Page 9
Hotel.java
536 JLabel label_3 = new JLabel("_");
537 label_3.setBounds(509, 174, 35, 31);
538 label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
539 panel_1.add(label_3);
540
541 JSeparator separator_2 = new JSeparator();
542 separator_2.setBounds(620, 21, 9, 320);
543 separator_2.setOrientation(SwingConstants.VERTICAL);
544 panel_1.add(separator_2);
545
546 JSeparator separator_3 = new JSeparator();
547 separator_3.setBounds(22, 233, 580, 2);
548 panel_1.add(separator_3);
549
550 JComboBox btnChooseRoom = new JComboBox();
551 btnChooseRoom.setBounds(22, 245, 207, 38);
552 btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "101", 
"201", "VIP"}));
553 btnChooseRoom.setFont(new Font("Tahoma", Font.PLAIN, 25));
554 panel_1.add(btnChooseRoom);
555
556 JCheckBox btnDelivery = new JCheckBox("Delivery");
557 btnDelivery.setBounds(22, 289, 207, 31);
558 btnDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
559 panel_1.add(btnDelivery);
560
561 JCheckBox btnTax = new JCheckBox("Tax");
562 btnTax.setBounds(22, 322, 93, 21);
563 btnTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
564 panel_1.add(btnTax);
565
566 JLabel lblCurrencyConverter = new JLabel("Currency Converter");
567 lblCurrencyConverter.setBounds(648, 21, 313, 31);
568 lblCurrencyConverter.setForeground(Color.BLUE);
569 lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
570 panel_1.add(lblCurrencyConverter);
571
572 JComboBox btnSelectCountry = new JComboBox();
573 btnSelectCountry.setBounds(664, 62, 269, 38);
574 btnSelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", 
"Nigeria", "Kenya", "China", "India"}));
575 btnSelectCountry.setFont(new Font("Tahoma", Font.PLAIN, 25));
576 panel_1.add(btnSelectCountry);
577
578 txtEnterCurrency = new JTextField();
579 txtEnterCurrency.setHorizontalAlignment(SwingConstants.CENTER);
580 txtEnterCurrency.setBounds(664, 128, 269, 47);
581 txtEnterCurrency.setFont(new Font("Tahoma", Font.BOLD, 30));
582 txtEnterCurrency.setColumns(10);
583 panel_1.add(txtEnterCurrency);
584
585 JLabel txtCurrencyOutput = new JLabel("");
586 txtCurrencyOutput.setHorizontalAlignment(SwingConstants.CENTER);
587 txtCurrencyOutput.setFont(new Font("Tahoma", Font.PLAIN, 25));
588 txtCurrencyOutput.setBounds(664, 208, 269, 38);
589 txtCurrencyOutput.setBorder(new LineBorder(new Color(0, 0, 0), 1));
590 panel_1.add(txtCurrencyOutput);
Page 10
Hotel.java
591
592 JButton btnReset2 = new JButton("Reset");
593 btnReset2.addActionListener(new ActionListener() {
594 public void actionPerformed(ActionEvent arg0) {
595
596 txtCurrencyOutput.setText(null);
597 txtEnterCurrency.setText(null);
598 btnSelectCountry.setSelectedItem("Country");
599
600 }
601 });
602 btnReset2.setBounds(810, 282, 123, 38);
603 btnReset2.setFont(new Font("Tahoma", Font.BOLD, 25));
604 panel_1.add(btnReset2);
605
606 JButton btnConvert = new JButton("Convert");
607 btnConvert.addActionListener(new ActionListener() {
608 public void actionPerformed(ActionEvent arg0) {
609
610 double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());
611
612 if (btnSelectCountry.getSelectedItem().equals("Nigeria"))
613 {
614 String Naira = String.format("N %.2f", USA_Dollar*Nigerian_Naira);
615 txtCurrencyOutput.setText(Naira);
616 }
617
618 if (btnSelectCountry.getSelectedItem().equals("Kenya"))
619 {
620 String Shilling = String.format("KS %.2f", USA_Dollar*Kenyan_Shilling);
621 txtCurrencyOutput.setText(Shilling);
622 }
623
624 if (btnSelectCountry.getSelectedItem().equals("China"))
625 {
626 String Yuan = String.format("CY %.2f", USA_Dollar*Chinese_Yuan);
627 txtCurrencyOutput.setText(Yuan);
628 }
629
630 if (btnSelectCountry.getSelectedItem().equals("India"))
631 {
632 String Rupee = String.format("INR %.2f", USA_Dollar*Indian_Rupee);
633 txtCurrencyOutput.setText(Rupee);
634 }
635
636 }
637 });
638 btnConvert.setBounds(664, 282, 150, 38);
639 btnConvert.setFont(new Font("Tahoma", Font.BOLD, 25));
640 panel_1.add(btnConvert);
641
642 JPanel panel_2 = new JPanel();
643 panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 10));
644 panel_2.setBounds(492, 499, 982, 259);
645 frame.getContentPane().add(panel_2);
646 panel_2.setLayout(null);
647
Page 11
Hotel.java
648 JLabel btnTotalCostOfMeal = new JLabel("Total Cost of Meal");
649 btnTotalCostOfMeal.setBounds(29, 32, 224, 31);
650 btnTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
651 panel_2.add(btnTotalCostOfMeal);
652
653 JLabel btnTotalCostOfDrink = new JLabel("Total Cost of Drink");
654 btnTotalCostOfDrink.setBounds(29, 88, 224, 31);
655 btnTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
656 panel_2.add(btnTotalCostOfDrink);
657
658 JLabel btnCostOfDelivery = new JLabel("Cost of Delivery");
659 btnCostOfDelivery.setBounds(29, 149, 224, 31);
660 btnCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 25));
661 panel_2.add(btnCostOfDelivery);
662
663 JLabel btnCostOfRoom = new JLabel("Cost of Room");
664 btnCostOfRoom.setBounds(29, 202, 224, 31);
665 btnCostOfRoom.setFont(new Font("Tahoma", Font.PLAIN, 25));
666 panel_2.add(btnCostOfRoom);
667
668 JLabel txtTotalCostOfMeal = new JLabel("");
669 txtTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
670 txtTotalCostOfMeal.setBounds(318, 25, 269, 38);
671 txtTotalCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
672 panel_2.add(txtTotalCostOfMeal);
673
674 JLabel txtTotalCostOfDrink = new JLabel("");
675 txtTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
676 txtTotalCostOfDrink.setBounds(318, 81, 269, 38);
677 txtTotalCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
678 panel_2.add(txtTotalCostOfDrink);
679
680 JLabel txtCostOfDelivery = new JLabel("");
681 txtCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 25));
682 txtCostOfDelivery.setBounds(318, 142, 269, 38);
683 txtCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
684 panel_2.add(txtCostOfDelivery);
685
686 JLabel txtCostOfRoom = new JLabel("");
687 txtCostOfRoom.setBounds(318, 195, 269, 38);
688 txtCostOfRoom.setBorder(new LineBorder(new Color(0, 0, 0), 1));
689 panel_2.add(txtCostOfRoom);
690
691 JSeparator separator_4 = new JSeparator();
692 separator_4.setBounds(619, 22, 8, 211);
693 separator_4.setOrientation(SwingConstants.VERTICAL);
694 panel_2.add(separator_4);
695
696 JLabel btnTax1 = new JLabel("Tax");
697 btnTax1.setBounds(637, 88, 52, 31);
698 btnTax1.setFont(new Font("Tahoma", Font.PLAIN, 25));
699 panel_2.add(btnTax1);
700
701 JLabel btnSubTotal = new JLabel("Sub Total");
702 btnSubTotal.setBounds(637, 149, 114, 31);
703 btnSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
704 panel_2.add(btnSubTotal);
Page 12
Hotel.java
705
706 JLabel btnTotal = new JLabel("Total");
707 btnTotal.setBounds(637, 202, 80, 31);
708 btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
709 panel_2.add(btnTotal);
710
711 JLabel txtTax = new JLabel("");
712 txtTax.setFont(new Font("Tahoma", Font.PLAIN, 25));
713 txtTax.setBounds(774, 81, 180, 38);
714 txtTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
715 panel_2.add(txtTax);
716
717 JLabel txtSubTotal = new JLabel("");
718 txtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
719 txtSubTotal.setBounds(774, 142, 180, 38);
720 txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
721 panel_2.add(txtSubTotal);
722
723 JLabel txtTotal = new JLabel("");
724 txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
725 txtTotal.setBounds(774, 195, 180, 38);
726 txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
727 panel_2.add(txtTotal);
728
729 lblClock = new JLabel("Clock");
730 lblClock.setFont(new Font("Tahoma", Font.PLAIN, 25));
731 lblClock.setBounds(637, 25, 317, 38);
732 panel_2.add(lblClock);
733
734 JLabel lblNewLabel = new JLabel("Hotel Management System");
735 lblNewLabel.setForeground(Color.BLUE);
736 lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
737 lblNewLabel.setBounds(512, 31, 959, 109);
738 frame.getContentPane().add(lblNewLabel);
739
740 JMenuBar menuBar = new JMenuBar();
741 menuBar.setBounds(10, 0, 1454, 41);
742 frame.getContentPane().add(menuBar);
743
744 JMenu mnFile = new JMenu("File");
745 mnFile.setFont(new Font("Segoe UI", Font.BOLD, 20));
746 menuBar.add(mnFile);
747
748 JMenu mnNew = new JMenu("New");
749 mnNew.setFont(new Font("Segoe UI", Font.BOLD, 20));
750 mnFile.add(mnNew);
751
752 JMenuItem mntmReceipt = new JMenuItem("Receipt");
753 mntmReceipt.addActionListener(new ActionListener() {
754 public void actionPerformed(ActionEvent arg0) {
755
756 Double Invoice1 = Double.parseDouble(txtFriedRice.getText());
757 Double Invoice2 = Double.parseDouble(txtShawarma.getText());
758 Double Invoice3 = Double.parseDouble(txtChicken.getText());
759 Double Invoice4 = Double.parseDouble(txtChooseDrink.getText());
760
761 ReceiptArea.append("\t\nHotel Management System:\n"
Page 13
Hotel.java
762 + "\nFried Rice: \t\t" + Invoice1
763 + "\nShawarma: \t\t" + Invoice2
764 + "\nChicken : \t\t" + Invoice3
765 + "\n" + btnChooseDrink.getSelectedItem() + " :\t\t" + 
Invoice4
766 +"\nTotal : \t\t" + txtTotal.getText()
767 + "\n\nWelcome and Thank you for your patronage"
768 );
769
770 }
771 });
772 mntmReceipt.setFont(new Font("Segoe UI", Font.BOLD, 20));
773 mnNew.add(mntmReceipt);
774
775 JMenuItem mntmReset = new JMenuItem("Reset");
776 mntmReset.addActionListener(new ActionListener() {
777 public void actionPerformed(ActionEvent arg0) {
778
779 txtFriedRice.setText(null);
780 txtShawarma.setText(null);
781 txtChicken.setText(null);
782 txtChooseDrink.setText(null);
783 txtTotalCostOfMeal.setText(null);
784 txtTotalCostOfDrink.setText(null);
785 txtCostOfDelivery.setText(null);
786 txtCostOfRoom.setText(null);
787 txtTax.setText(null);
788 txtSubTotal.setText(null);
789 txtTotal.setText(null);
790 txtEnterCurrency.setText(null);
791 txtCurrencyOutput.setText(null);
792 txtDisplay.setText(null);
793 btnChooseDrink.setSelectedItem("Choose a drink");
794 btnChooseRoom.setSelectedItem("Choose a room");
795 btnSelectCountry.setSelectedItem("Country");
796 ReceiptArea.setText(null);
797
798 }
799 });
800 mntmReset.setFont(new Font("Segoe UI", Font.BOLD, 20));
801 mnNew.add(mntmReset);
802
803 JMenuItem mntmConvert = new JMenuItem("Convert");
804 mntmConvert.addActionListener(new ActionListener() {
805 public void actionPerformed(ActionEvent arg0) {
806
807 double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());
808
809 if (btnSelectCountry.getSelectedItem().equals("Nigeria"))
810 {
811 String Naira = String.format("N %.2f", USA_Dollar*Nigerian_Naira);
812 txtCurrencyOutput.setText(Naira);
813 }
814
815 if (btnSelectCountry.getSelectedItem().equals("Kenya"))
816 {
817 String Shilling = String.format("KS %.2f", USA_Dollar*Kenyan_Shilling);
Page 14
Hotel.java
818 txtCurrencyOutput.setText(Shilling);
819 }
820
821 if (btnSelectCountry.getSelectedItem().equals("China"))
822 {
823 String Yuan = String.format("CY %.2f", USA_Dollar*Chinese_Yuan);
824 txtCurrencyOutput.setText(Yuan);
825 }
826
827 if (btnSelectCountry.getSelectedItem().equals("India"))
828 {
829 String Rupee = String.format("INR %.2f", USA_Dollar*Indian_Rupee);
830 txtCurrencyOutput.setText(Rupee);
831 }
832
833 }
834 });
835 mntmConvert.setFont(new Font("Segoe UI", Font.BOLD, 20));
836 mnFile.add(mntmConvert);
837
838 JMenuItem mntmTotal = new JMenuItem("Total");
839 mntmTotal.setFont(new Font("Segoe UI", Font.BOLD, 20));
840 mnFile.add(mntmTotal);
841
842 JSeparator separator = new JSeparator();
843 mnFile.add(separator);
844
845 JMenuItem mntmRefresh = new JMenuItem("Refresh");
846 mntmRefresh.addActionListener(new ActionListener() {
847 public void actionPerformed(ActionEvent arg0) {
848
849 txtFriedRice.setText(null);
850 txtShawarma.setText(null);
851 txtChicken.setText(null);
852 txtChooseDrink.setText(null);
853 txtTotalCostOfMeal.setText(null);
854 txtTotalCostOfDrink.setText(null);
855 txtCostOfDelivery.setText(null);
856 txtCostOfRoom.setText(null);
857 txtTax.setText(null);
858 txtSubTotal.setText(null);
859 txtTotal.setText(null);
860 txtEnterCurrency.setText(null);
861 txtCurrencyOutput.setText(null);
862 txtDisplay.setText(null);
863 btnChooseDrink.setSelectedItem("Choose a drink");
864 btnChooseRoom.setSelectedItem("Choose a room");
865 btnSelectCountry.setSelectedItem("Country");
866 ReceiptArea.setText(null);
867
868 }
869 });
870 mntmRefresh.setFont(new Font("Segoe UI", Font.BOLD, 20));
871 mnFile.add(mntmRefresh);
872
873 JSeparator separator_1 = new JSeparator();
874 mnFile.add(separator_1);
Page 15
Hotel.java
875
876 JMenuItem mntmExit = new JMenuItem("Exit");
877 mntmExit.addActionListener(new ActionListener() {
878 public void actionPerformed(ActionEvent arg0) {
879
880 System.exit(0);
881
882 }
883 });
884 mntmExit.setForeground(Color.RED);
885 mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 20));
886 mnFile.add(mntmExit);
887
888 JMenu mnConvert = new JMenu("Convert");
889 mnConvert.setFont(new Font("Segoe UI", Font.BOLD, 20));
890 menuBar.add(mnConvert);
891
892 JMenu mnTotal = new JMenu("Total");
893 mnTotal.setFont(new Font("Segoe UI", Font.BOLD, 20));
894 menuBar.add(mnTotal);
895
896 JMenu mnReset = new JMenu("Reset");
897 mnReset.setFont(new Font("Segoe UI", Font.BOLD, 20));
898 menuBar.add(mnReset);
899
900 JMenu mnReceipt = new JMenu("Receipt");
901 mnReceipt.setFont(new Font("Segoe UI", Font.BOLD, 20));
902 menuBar.add(mnReceipt);
903
904 JMenu mnExit = new JMenu("Exit");
905 mnExit.setFont(new Font("Segoe UI", Font.BOLD, 20));
906 menuBar.add(mnExit);
907
908 JButton btnSubmit = new JButton("Submit");
909 btnSubmit.addActionListener(new ActionListener() {
910 public void actionPerformed(ActionEvent arg0) {
911
912 //==========================Drink==============================
913
914 double Drinks = Double.parseDouble(txtChooseDrink.getText());
915 double CocaCola = 0.957*Drinks;
916 double Heineken = 2.432*Drinks;
917 double Pepsi = 1.674*Drinks;
918
919 if(btnChooseDrink.getSelectedItem().equals("Coca Cola"))
920 {
921 String pCoca_Cola = String.format("%.3f", CocaCola);
922 txtTotalCostOfDrink.setText(pCoca_Cola);
923 }
924
925 if(btnChooseDrink.getSelectedItem().equals("Heineken"))
926 {
927 String pHeineken = String.format("%.3f", Heineken);
928 txtTotalCostOfDrink.setText(pHeineken);
929 }
930
931 if(btnChooseDrink.getSelectedItem().equals("Pepsi"))
Page 16
Hotel.java
932 {
933 String pPepsi = String.format("%.3f", Pepsi);
934 txtTotalCostOfDrink.setText(pPepsi);
935 }
936
937 if(btnChooseDrink.getSelectedItem().equals("Choose a drink"))
938 {
939 txtTotalCostOfDrink.setText("0.000");
940 }
941
942
943 //============================Meal==========================
944
945 double FriedRice = Double.parseDouble(txtFriedRice.getText());
946 double pFriedRice = 5.676;
947 double getFriedRice; 
948 getFriedRice = (FriedRice * pFriedRice);
949 String TotalFriedRice = String.format("%.3f", getFriedRice);
950 txtTotalCostOfMeal.setText(TotalFriedRice);
951
952 double Shawarma = Double.parseDouble(txtShawarma.getText());
953 double pShawarma = 3.987;
954 double getShawarma; 
955 getShawarma = (Shawarma * pShawarma);
956 String TotalShawarma = String.format("%.3f", getShawarma + getFriedRice);
957 txtTotalCostOfMeal.setText(TotalShawarma);
958
959 double Chicken = Double.parseDouble(txtChicken.getText());
960 double pChicken = 9.452;
961 double getChicken; 
962 getChicken = (Chicken * pChicken);
963 String TotalChicken = String.format("%.3f", getChicken + getShawarma + 
getFriedRice);
964 txtTotalCostOfMeal.setText(TotalChicken);
965
966 //========================Delivery===========================
967
968 double cDelivery = 4.50; 
969 if(btnDelivery.isSelected())
970 {
971 String pDelivery = String.format("%.3f", cDelivery);
972 txtCostOfDelivery.setText(pDelivery);
973 }
974 else
975 {
976 txtCostOfDelivery.setText("0.000");
977 }
978
979 //=======================Tax=====================================
980
981 double pTotal1 = Double.parseDouble(txtTotalCostOfMeal.getText());
982 double pTotal2 = Double.parseDouble(txtTotalCostOfDrink.getText());
983 double pTotal3 = Double.parseDouble(txtCostOfDelivery.getText());
984 double cTotal = (pTotal1 + pTotal2 + pTotal3)/100;
985
986 if(btnTax.isSelected())
987 {
Page 17
Hotel.java
988 String xTotal = String.format("%.3f", cTotal);
989 txtTax.setText(xTotal);
990 }
991
992 //===========================Total=================================
993 double pTotal4 = Double.parseDouble(txtTax.getText());
994
995 String zTaxTotal = String.format("$%.3f", pTotal4);
996 txtTax.setText(zTaxTotal);
997
998 double SubTotal = (pTotal1 + pTotal2 + pTotal3);
999 String pSubTotal = String.format("$%.3f", SubTotal);
1000 txtSubTotal.setText(pSubTotal);
1001
1002 double xTotal = (pTotal1 + pTotal2 + pTotal3 + pTotal4);
1003 String yTotal = String.format("$%.3f", xTotal);
1004 txtTotal.setText(yTotal);
1005 }
1006 });
1007 btnSubmit.setBounds(333, 282, 150, 38);
1008 btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 25));
1009 panel_1.add(btnSubmit);
1010
1011 JButton btnReset1 = new JButton("Reset");
1012 btnReset1.addActionListener(new ActionListener() {
1013 public void actionPerformed(ActionEvent arg0) {
1014 txtFriedRice.setText(null);
1015 txtShawarma.setText(null);
1016 txtChicken.setText(null);
1017 txtChooseDrink.setText(null);
1018 txtTotalCostOfMeal.setText(null);
1019 txtTotalCostOfDrink.setText(null);
1020 txtCostOfDelivery.setText(null);
1021 txtCostOfRoom.setText(null);
1022 txtTax.setText(null);
1023 txtSubTotal.setText(null);
1024 txtTotal.setText(null);
1025 txtEnterCurrency.setText(null);
1026 txtCurrencyOutput.setText(null);
1027 txtDisplay.setText(null);
1028 btnChooseDrink.setSelectedItem("Choose a drink");
1029 btnChooseRoom.setSelectedItem("Choose a room");
1030 btnSelectCountry.setSelectedItem("Country");
1031 ReceiptArea.setText(null);
1032 }
1033 });
1034 btnReset1.setBounds(479, 282, 123, 38);
1035 btnReset1.setFont(new Font("Tahoma", Font.BOLD, 25));
1036 panel_1.add(btnReset1);
1037 }
1038 }
1039