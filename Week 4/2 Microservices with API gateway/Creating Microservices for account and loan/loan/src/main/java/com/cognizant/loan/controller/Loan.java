package com.cognizant.loan.controller;

public record Loan(String number, String type, long loan, int emi, int tenure) {
}
