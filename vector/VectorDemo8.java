package vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo8 {
          public static void main(String[] args) {
                    Vector<String> todolist = new Vector<>();
                    Scanner sc = new Scanner(System.in);
                    int choice;
                    do {
                              System.out.println("To do List");
                              System.out.println("1.Add task");
                              System.out.println("2.View Task");
                              System.out.println("3.mark task to compleate");
                              System.out.println("4.exit");

                              choice = Integer.parseInt(sc.nextLine());

                              switch (choice) {
                                        case 1 -> {
                                                  System.out.println("enter your task");
                                                  String task = sc.nextLine();
                                                  todolist.add(task);
                                                  System.out.println("task added successefully");
                                        }
                                        case 2 -> {
                                                  System.out.println("to do list");
                                                  for (int i = 0; i < todolist.size(); i++) {
                                                            System.out.println((i + 1) + " . " + todolist.get(i));
                                                  }
                                        }
                                        case 3 -> {
                                                  System.out.println("enter marked task");
                                                  int task = Integer.parseInt(sc.nextLine());
                                                  if (task >= 1 && task <= todolist.size()) {
                                                            String complete = todolist.remove(task - 1);
                                                            System.out.println("task marked cmoeted " + complete);
                                                  }
                                        }
                                        case 4 -> {
                                                  System.out.println("Exiting the toddolist!!");
                                                  System.exit(0);

                                        }

                              }
                    } while (choice != 4);
                    sc.close();

          }
}
