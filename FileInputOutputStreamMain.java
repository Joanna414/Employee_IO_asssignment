package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.FileInputStreamUtil;
import com.montran.util.FileOutputStreamUtil;

public class FileInputOutputStreamMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStreamUtil util = new FileInputStreamUtil();
		FileOutputStreamUtil util1 = new FileOutputStreamUtil();
		int employeeId;
		String name;
		double salary;
		String filepath;
		File file;
		String data;
		byte[] filedata;

		System.out.println("Enter Employee Id");
		employeeId = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();

		System.out.println("Enter Salary");
		salary = scanner.nextDouble();

		// write
		scanner.nextLine();
		System.out.println("Enter the path of file");
		filepath = scanner.nextLine();
		file = new File(filepath);

		data = employeeId + " " + name + " " + salary;
		util1.writeDataIntoFile(file, data.getBytes());

		System.out.println("Details of employee updated !!");

		// read
		System.out.println();
		System.out.println("Enter the path of file");
		filepath = scanner.nextLine();
		file = new File(filepath);
		filedata = util.getFileData(file);
		System.out.println("Data From File");
		for (byte b : filedata) {
			System.out.print((char) b);
		}

	}

}
