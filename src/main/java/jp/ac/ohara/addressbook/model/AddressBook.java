package jp.ac.ohara.addressbook.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "addressbooks")
public class AddressBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "email")
    private String email;
    
    @Column(name = "age")
    private Integer age;
    
    @Column(name = "phone")
    private String phone;
    
    private LocalDateTime update_at;
    private LocalDateTime delete_at;
    private LocalDateTime created_at;

    // コンストラクタ、ゲッター、セッターなどが含まれます

    // コンストラクタ
    public AddressBook() {
    }

    // ゲッターとセッター
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getUpdatedAt() {
        return update_at;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.update_at = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return delete_at;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.delete_at = deletedAt;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.created_at = createdAt;
    }
}
