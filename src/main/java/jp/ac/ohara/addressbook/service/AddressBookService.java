package jp.ac.ohara.addressbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.addressbook.model.AddressBook;
import jp.ac.ohara.addressbook.repository.AddressBookRepository;

@Service
@Transactional
public class AddressBookService {

	@Autowired
	private AddressBookRepository repository;

	/**
	 * アドレス帳一覧の取得
	 * @return List<AddressBook>
	 */
	public List<AddressBook> getAddressList() {
	    List<AddressBook> entityList = this.repository.findAll();
	    return entityList;
	}

	/**
	 * 詳細データの取得
	 * @param @NonNull Long index
	 * @return  AddressBook
	 */
	public AddressBook get(@NonNull Long index) {
		AddressBook addressBook = this.repository.findById(index).orElse(new AddressBook());
		return addressBook;
	}

	/**
	 * アドレス帳データの保存
	 * @param AddressBook addressBook
	 */
	public void save(@NonNull AddressBook addressBook) {
		this.repository.save(addressBook);
	}

	/**
	 * アドレス帳データの削除
	 * @param @NonNull Long index
	 */
	public void delete(@NonNull Long index) {
		this.repository.deleteById(index);
	}
}
