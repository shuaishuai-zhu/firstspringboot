package com.jiangrongxin.work.model;

import java.util.Date;

public class Transaction {
    private Integer trans_id;//交易id
    private Integer cust_id;//客户号
    private String account;//账户号
    private String card_nbr;//卡号
    private Integer tranno;//交易流水号
    private Integer month_nbr;//账单月
    private Double bill;//交易金额
    private String trans_type;//交易类型
    private Date txn_datetime;//交易日期

    public Integer getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(Integer trans_id) {
        this.trans_id = trans_id;
    }

    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCard_nbr() {
        return card_nbr;
    }

    public void setCard_nbr(String card_nbr) {
        this.card_nbr = card_nbr;
    }

    public Integer getTranno() {
        return tranno;
    }

    public void setTranno(Integer tranno) {
        this.tranno = tranno;
    }

    public Integer getMonth_nbr() {
        return month_nbr;
    }

    public void setMonth_nbr(Integer month_nbr) {
        this.month_nbr = month_nbr;
    }

    public Double getBill() {
        return bill;
    }

    public void setBill(Double bill) {
        this.bill = bill;
    }

    public String getTrans_type() {
        return trans_type;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public Date getTxn_datetime() {
        return txn_datetime;
    }

    public void setTxn_datetime(Date txn_datetime) {
        this.txn_datetime = txn_datetime;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trans_id=" + trans_id +
                ", cust_id=" + cust_id +
                ", account='" + account + '\'' +
                ", card_nbr='" + card_nbr + '\'' +
                ", tranno=" + tranno +
                ", month_nbr=" + month_nbr +
                ", bill=" + bill +
                ", trans_type='" + trans_type + '\'' +
                ", txn_datetime=" + txn_datetime +
                '}';
    }
}
