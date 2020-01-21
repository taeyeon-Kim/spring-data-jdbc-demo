package me.taeyeonkim.springdatajdbcdemo.manytomany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

@Table("book_author")
@AllArgsConstructor
@Getter
@ToString
public class BookAuthorReference {
    private Long author;
    private Long book;
}
