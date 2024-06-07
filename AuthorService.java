package com.ey10;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface AuthorService {
	Set<String>getUniqueSurnames(List<Author>authors);
	
	Map<String, List<Author>>getAuthorsByCity(List<Author>authors);
	double getFemaleAverageAge(List<Author>authors);
	Optional<String>getMobileByAadhar(List<Author>authors, String aadhar);

}
