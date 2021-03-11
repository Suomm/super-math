/*
 * Copyright 2015-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.math.inequality;

import com.github.math.SuperMath;
import com.github.math.utils.MathUtils;

import java.util.Objects;

/**
 * <p>
 * 一元一次不等式。
 * 
 * @author 王帅
 */
public final strictfp class LinearInequality {
	
	private final double a;
	private final double b;
	private final InequalitySign sign;
	
	public LinearInequality(double a, double b, InequalitySign sign) {
		Objects.requireNonNull(sign);
		MathUtils.notZero(a, null);
		this.a = a;
		this.b = b;
		this.sign = sign;
	}
	
	@Override
	public String toString() {
		StringBuilder bur = new StringBuilder();
		if (a == -1) {
			bur.append('-');
		} else if (a != 1) {
			bur.append(SuperMath.toString(a));
		} 
		bur.append('x');
		if (b != 0) {
			bur.append(SuperMath.toString(b));
		}
		bur.append(sign.sign()).append(0);
		return bur.toString();
	}

}