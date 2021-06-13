package com.java.demo.OrclDevopsChallenge.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FibonacciDto {
	
	@NotNull
	@JsonProperty("member-count")
	private Integer memberCount;
	
	@JsonProperty("sequence")
	private List<Integer> sequence;
	
	@JsonProperty("total")
	private Integer total;
	
	public FibonacciDto(Integer memberCount, List<Integer> sequence,
			Integer total) {
		super();
		this.memberCount = memberCount;
		this.sequence = sequence;
		this.total = total;
	}

	public Integer getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	public List<Integer> getSequence() {
		return sequence;
	}

	public void setSequence(List<Integer> sequence) {
		this.sequence = sequence;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
