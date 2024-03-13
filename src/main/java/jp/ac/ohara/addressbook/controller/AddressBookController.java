package jp.ac.ohara.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.ac.ohara.addressbook.model.AddressBook;
import jp.ac.ohara.addressbook.service.AddressBookService;

@Controller
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping("/addressbooks")
    public String getAllAddressBooks(Model model) {
        // AddressBookServiceを使用してすべてのアドレス帳データを取得
        model.addAttribute("addressList", addressBookService.getAddressList());
        return "addressbook-list"; // ビューの名前を返す
    }
    
    @GetMapping("/addressbooks/register")
    public String showRegisterForm(Model model) {
        // 新しいAddressBookオブジェクトを作成し、フォームにバインドする
        model.addAttribute("addressBook", new AddressBook());
        return "addressbook-register"; // フォームのビューを返す
    }

    @PostMapping("/addressbooks/register")
    public String registerAddressBook(@ModelAttribute AddressBook addressBook) {
        // フォームから送信されたデータを処理する
        addressBookService.save(addressBook);
        return "redirect:/addressbooks"; // アドレス帳一覧ページにリダイレクト
    }
    
    @PostMapping("/addressbooks")
    public String deleteAddressBook(@RequestParam("id") Long id) {
        // IDを使用してアドレス帳データを削除する
        addressBookService.delete(id);
        return "redirect:/addressbooks"; // アドレス帳一覧ページにリダイレクト
    }
    
    
}


