package com.example.model;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 用戶的資料模型。
 * 
 * @author Z
 * @version 1.0
 */
@Entity
@Table(name = "tb_person")
public class PersonModel {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;

	@Column(name = "name")
	@Comment(value = "名字")
	private String name;
	

	@Column(name = "nickname")
	@Comment(value = "暱稱")
	private String nickname;

	@Column(name = "sex")
	@Comment(value = "性別")
	private String sex;

	@Column(name = "birthday")
	@Comment(value = "生日")
	private String birthday;

	@Column(name = "description")
	@Comment(value = "備註")
	private String description;

	@CreationTimestamp
	@Column(name = "create_time")
	@Comment(value = "建立時間")
	private String create_time;
	
	/**
	 * 資料ID。
	 * 
	 * @return 資料ID。
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 設定資料ID。
	 * 
	 * @param id 資料ID。
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 取得姓名。
	 * 
	 * @return 姓名。
	 */
	public String getName() {
		return name;
	}

	/**
	 * 設定姓名。
	 * 
	 * @param name 要設定的姓名。
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 取得暱稱。
	 * 
	 * @return 暱稱。
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * 設定暱稱。
	 * 
	 * @param nickname 要設定的暱稱。
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * 取得性別。
	 * 
	 * @return 性別。
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 設定性別。
	 * 
	 * @param sex 要設定的性別。
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 取得生日。
	 * 
	 * @return 生日。
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * 設定生日。
	 * 
	 * @param birthday 要設定的生日。
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * 取得備註。
	 * 
	 * @return 備註。
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 設定備註。
	 * 
	 * @param description 要設定的備註。
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 取得創建時間。
	 * 
	 * @return 創建時間。
	 */
	public String getCreate_time() {
		return create_time;
	}

	/**
	 * 設定創建時間。
	 * 
	 * @param create_time 要設定的創建時間。
	 */
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	public PersonModel() {};

	public PersonModel(String name, String nickname, String sex, String birthday, String description, String create_time) {
		this.name = name;
		this.nickname = nickname;
		this.sex = sex;
		this.birthday = birthday;
		this.description = description;
		this.create_time = create_time;
	};
}
