package com.maven.entity;

import org.junit.Test;

import com.maven.entity.HelloWorld;

public class HelloTest {

	@Test
	public void test1() {
		HelloWorld hello = new HelloWorld();
		hello.say();
	}
	@Test
	public void test2() {
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.print());
	}
}
