import java.util.Scanner;

/******************************************************************************
 * Copyright (c) 2020 Objective
 * All rights reserved
 *
 * This software is the confidential and proprietary information of Objective.
 * You shall not disclose this confidential information and shall use it only
 * in accordance with the terms of the license agreement you entered into with
 * Objective.
 *******************************************************************************/

public class HelloPerson
{
  public static void main(String[] args)
  {
    System.out.println("Hello " + getName());
  }

  private static String getName()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Name: ");
    return scanner.nextLine();
  }
}
