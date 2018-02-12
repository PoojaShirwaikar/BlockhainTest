package com.psl.exassi3;

public class Service {

	String[] serviceName = { "TALKTIME", "SMS", "2G", "3G", "4G" };
	float[] charges = { 30, 30, 99, 199, 299 };
	float[] charges1 = new float[5];

	// boolean s1,s2,s3,s4,s5;

	public float choice(boolean c1, boolean c2, boolean c3, boolean c4,
			boolean c5, int i) {
		if (c1)
			charges1[i] = charges1[i] + charges[0];
		if (c2)
			charges1[i] = charges1[i] + charges[1];
		if (c3)
			charges1[i] = charges1[i] + charges[2];
		if (c4)
			charges1[i] = charges1[i] + charges[3];
		if (c5)
			charges1[i] = charges1[i] + charges[4];

		charges1[i] = charges1[i] * 1.15f;

		System.out.println("For User " + i + " charges:" + charges1[i]);

		return charges1[i];
	}

}
