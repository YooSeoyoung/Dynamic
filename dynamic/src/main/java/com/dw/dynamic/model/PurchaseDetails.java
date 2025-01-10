package com.dw.dynamic.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "purchase_details")
public class PurchaseDetails {
    @Id
    @Column(name = "id")
    private String id;

    @OneToMany(mappedBy = "review")
    private Review review; // 양방향

    @ManyToOne
    @JoinColumn(name = "payment")
    private Payment payment; // 단방향

   @OneToMany(mappedBy = "payroll_template")
    private List<PayrollTemplate> payrollTemplateList= new ArrayList<>();

}
