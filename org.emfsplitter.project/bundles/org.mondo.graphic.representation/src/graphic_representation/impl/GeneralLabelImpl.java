/**
 */
package graphic_representation.impl;

import graphic_representation.GRFontFormat;
import graphic_representation.GRLabelStyleDescription;
import graphic_representation.GeneralLabel;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.LabelAligment;
import graphic_representation.LabelPosition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.GeneralLabelImpl#getLabelFormat <em>Label Format</em>}</li>
 *   <li>{@link graphic_representation.impl.GeneralLabelImpl#isShowIcon <em>Show Icon</em>}</li>
 *   <li>{@link graphic_representation.impl.GeneralLabelImpl#getLabelPosition <em>Label Position</em>}</li>
 *   <li>{@link graphic_representation.impl.GeneralLabelImpl#getLabelAligment <em>Label Aligment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralLabelImpl extends ShapeColorImpl implements GeneralLabel {
	/**
	 * The cached value of the '{@link #getLabelFormat() <em>Label Format</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<GRFontFormat> labelFormat;

	/**
	 * The default value of the '{@link #isShowIcon() <em>Show Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowIcon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_ICON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowIcon() <em>Show Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowIcon()
	 * @generated
	 * @ordered
	 */
	protected boolean showIcon = SHOW_ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelPosition() <em>Label Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final LabelPosition LABEL_POSITION_EDEFAULT = LabelPosition.BORDER;

	/**
	 * The cached value of the '{@link #getLabelPosition() <em>Label Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPosition()
	 * @generated
	 * @ordered
	 */
	protected LabelPosition labelPosition = LABEL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelAligment() <em>Label Aligment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAligment()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAligment LABEL_ALIGMENT_EDEFAULT = LabelAligment.CENTER;

	/**
	 * The cached value of the '{@link #getLabelAligment() <em>Label Aligment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAligment()
	 * @generated
	 * @ordered
	 */
	protected LabelAligment labelAligment = LABEL_ALIGMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.GENERAL_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GRFontFormat> getLabelFormat() {
		if (labelFormat == null) {
			labelFormat = new EDataTypeUniqueEList<GRFontFormat>(GRFontFormat.class, this, Graphic_representationPackage.GENERAL_LABEL__LABEL_FORMAT);
		}
		return labelFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowIcon() {
		return showIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowIcon(boolean newShowIcon) {
		boolean oldShowIcon = showIcon;
		showIcon = newShowIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.GENERAL_LABEL__SHOW_ICON, oldShowIcon, showIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelPosition getLabelPosition() {
		return labelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelPosition(LabelPosition newLabelPosition) {
		LabelPosition oldLabelPosition = labelPosition;
		labelPosition = newLabelPosition == null ? LABEL_POSITION_EDEFAULT : newLabelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.GENERAL_LABEL__LABEL_POSITION, oldLabelPosition, labelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAligment getLabelAligment() {
		return labelAligment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelAligment(LabelAligment newLabelAligment) {
		LabelAligment oldLabelAligment = labelAligment;
		labelAligment = newLabelAligment == null ? LABEL_ALIGMENT_EDEFAULT : newLabelAligment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.GENERAL_LABEL__LABEL_ALIGMENT, oldLabelAligment, labelAligment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_FORMAT:
				return getLabelFormat();
			case Graphic_representationPackage.GENERAL_LABEL__SHOW_ICON:
				return isShowIcon();
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_POSITION:
				return getLabelPosition();
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_ALIGMENT:
				return getLabelAligment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_FORMAT:
				getLabelFormat().clear();
				getLabelFormat().addAll((Collection<? extends GRFontFormat>)newValue);
				return;
			case Graphic_representationPackage.GENERAL_LABEL__SHOW_ICON:
				setShowIcon((Boolean)newValue);
				return;
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_POSITION:
				setLabelPosition((LabelPosition)newValue);
				return;
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_ALIGMENT:
				setLabelAligment((LabelAligment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_FORMAT:
				getLabelFormat().clear();
				return;
			case Graphic_representationPackage.GENERAL_LABEL__SHOW_ICON:
				setShowIcon(SHOW_ICON_EDEFAULT);
				return;
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_POSITION:
				setLabelPosition(LABEL_POSITION_EDEFAULT);
				return;
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_ALIGMENT:
				setLabelAligment(LABEL_ALIGMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_FORMAT:
				return labelFormat != null && !labelFormat.isEmpty();
			case Graphic_representationPackage.GENERAL_LABEL__SHOW_ICON:
				return showIcon != SHOW_ICON_EDEFAULT;
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_POSITION:
				return labelPosition != LABEL_POSITION_EDEFAULT;
			case Graphic_representationPackage.GENERAL_LABEL__LABEL_ALIGMENT:
				return labelAligment != LABEL_ALIGMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GRLabelStyleDescription.class) {
			switch (derivedFeatureID) {
				case Graphic_representationPackage.GENERAL_LABEL__LABEL_FORMAT: return Graphic_representationPackage.GR_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT;
				case Graphic_representationPackage.GENERAL_LABEL__SHOW_ICON: return Graphic_representationPackage.GR_LABEL_STYLE_DESCRIPTION__SHOW_ICON;
				case Graphic_representationPackage.GENERAL_LABEL__LABEL_POSITION: return Graphic_representationPackage.GR_LABEL_STYLE_DESCRIPTION__LABEL_POSITION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GRLabelStyleDescription.class) {
			switch (baseFeatureID) {
				case Graphic_representationPackage.GR_LABEL_STYLE_DESCRIPTION__LABEL_FORMAT: return Graphic_representationPackage.GENERAL_LABEL__LABEL_FORMAT;
				case Graphic_representationPackage.GR_LABEL_STYLE_DESCRIPTION__SHOW_ICON: return Graphic_representationPackage.GENERAL_LABEL__SHOW_ICON;
				case Graphic_representationPackage.GR_LABEL_STYLE_DESCRIPTION__LABEL_POSITION: return Graphic_representationPackage.GENERAL_LABEL__LABEL_POSITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (labelFormat: ");
		result.append(labelFormat);
		result.append(", showIcon: ");
		result.append(showIcon);
		result.append(", labelPosition: ");
		result.append(labelPosition);
		result.append(", labelAligment: ");
		result.append(labelAligment);
		result.append(')');
		return result.toString();
	}

} //GeneralLabelImpl
