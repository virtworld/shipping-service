package com.dmall.shippingservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Long orderId;
	private Long quantity;
	private String address;
    @OneToMany(cascade={ CascadeType.ALL })
    @JoinColumn(name="shippingId")
	private List<Logistic> logistics;
}


