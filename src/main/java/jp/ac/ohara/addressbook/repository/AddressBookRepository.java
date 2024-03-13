package jp.ac.ohara.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.addressbook.model.AddressBook;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {
	
}
