package com.arieldev.Ecommerce.Sport.service.interf;

import com.arieldev.Ecommerce.Sport.dto.AddressDto;
import com.arieldev.Ecommerce.Sport.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
