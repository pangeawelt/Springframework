
package com.example.book.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity

@Table(name = "roles")
public class Role {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String description;

	public Role() {
	};

}

// constructors, getter and setters are not shown for brevity }
