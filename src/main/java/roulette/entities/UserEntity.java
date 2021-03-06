package roulette.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@SuppressWarnings("unused")
@Entity
public class UserEntity {

	private @Id @GeneratedValue Long id;
	private int tokens;
	private String name;

	public Long getId () {
		return id;
	}

	public void setId ( Long id ) {
		this.id = id;
	}

	public int getTokens () {
		return tokens;
	}

	public void setTokens ( int tokens ) {
		this.tokens = tokens;
	}

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}
}
