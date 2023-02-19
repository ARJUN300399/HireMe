package com.arjun.joblisting.repository;

import com.arjun.joblisting.model.Post;

import java.util.ArrayList;
import java.util.List;

public interface SearchRepository {
     List<Post> findByText(String text);
     List<String> printString(String text);
}
