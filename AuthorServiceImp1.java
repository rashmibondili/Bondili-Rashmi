package com.ey10;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AuthorServiceImp1 implements AuthorService{
	
	@Override
	public double getFemaleAverageAge(List<Author> authors) {
		
		return authors.stream()
				.filter(author ->
				"female".equalsIgnoreCase(author.getGender()))
				.mapToLong(Author::getAge)
				.average()
				.orElse(0.0);
		
	}



	@Override
	public Map<String, List<Author>> getAuthorsByCity(List<Author> authors) {
		
		return authors.stream()
				.collect(Collectors.groupingBy(Author::getCity));
	}



	@Override
	public Optional<String> getMobileByAadhar(List<Author> authors, String aadhar) {
		
		return authors.stream()
				.filter(author -> author.getAadharcard().equals(aadhar))
				.map(Author::getMobile)
				.findFirst();
	}



	public Set<String> getUniqueSurnames(List<Author>authors) {
		return authors.stream()
				.map(Author::getName)
				.map(name -> name.substring(name.lastIndexOf(' ')+1))
				.collect(Collectors.toSet());
		
		
		
	}



	
	



	
}
