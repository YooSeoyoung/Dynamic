package com.dw.dynamic.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "payroll_template")
public class PayrollTemplate {
    @Id
    @Column(name = "id")
    private String id;

    @OneToOne
    @JoinColumn(name = "deduction")
    private Deduction deduction; // 양방향

    @OneToOne
    @JoinColumn(name = "employee")
    private Employee employee; //양방향

    @ManyToOne
    @JoinColumn(name = "purchase_details")
    private PurchaseDetails purchaseDetails;


}
