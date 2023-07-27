package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    boolean kitchen_flag = true;
    boolean bath_flag = true;
    boolean cleaning_flag = true;
    boolean pets_flag = true;
    boolean hcs_flag = true;
    boolean passport_flag = true;
    boolean dl_flag = true;
    boolean md_flag = true;
    boolean mfc_flag = true;
    boolean hcsEtc_flag = true;
    boolean hospital_flag = true;
    boolean registry_flag = true;
    boolean rent_flag = true;
    boolean estate_flag = true;
    boolean pay_flag = true;
    boolean dormitory_flag = true;
    boolean resume_flag = true;
    boolean interview_flag = true;
    boolean paws_flag = true;
    boolean salary_flag = true;

    public static int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentStateAdapter pageAdapter = new MyAdapter(this);
        FragmentManager fm = getSupportFragmentManager();
        if (flag == 0) {
            fm.beginTransaction().replace(R.id.fragmentView, HomeProblems.class, null).commit();
        }
        else if (flag == 1) {
            fm.beginTransaction().replace(R.id.fragmentView, PaperWork.class, null).commit();
        }
        else if (flag == 2) {
            fm.beginTransaction().replace(R.id.fragmentView, StateStructure.class, null).commit();
        }
        else if (flag == 3) {
            fm.beginTransaction().replace(R.id.fragmentView, HousingQuestions.class, null).commit();
        }
        else if (flag == 4) {
            fm.beginTransaction().replace(R.id.fragmentView, HowToWork.class, null).commit();
        }

        findViewById(R.id.fragmentView).setOnTouchListener(new Swipe(this) {
            @Override
            public void left() {
                if (flag == 0) {
                    flag = 1;
                    Intent main = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(main);
                    overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
                }
                else if (flag == 1) {
                    flag = 2;
                    Intent main = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(main);
                    overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
                }
                else if (flag == 2) {
                    flag = 3;
                    Intent main = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(main);
                    overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
                }
                else if (flag == 3) {
                    flag = 4;
                    Intent main = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(main);
                    overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
                }
            }

            @Override
            public void right() {
                if (flag == 0) {
                    Intent menu = new Intent(MainActivity.this, Menu.class);
                    startActivity(menu);
                    overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
                }
                if (flag == 1) {
                    flag = 0;
                    Intent main = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(main);
                    overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
                }
                else if (flag == 2) {
                    flag = 1;
                    Intent main = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(main);
                    overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
                }
                else if (flag == 3) {
                    flag = 2;
                    Intent main = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(main);
                    overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
                }
                else if (flag == 4) {
                    flag = 3;
                    Intent main = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(main);
                    overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
                }
            }
        });
    }

    public void kitchen(View view) {
        if (kitchen_flag) {
            this.findViewById(R.id.kitchenPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.kitchenLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            kitchen_flag = false;
        } else {
            this.findViewById(R.id.kitchenPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.kitchenLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            kitchen_flag = true;
        }
    }

    public void bath(View view) {
        if (bath_flag) {
            this.findViewById(R.id.bathPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.bathLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            bath_flag = false;
        } else {
            this.findViewById(R.id.bathPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.bathLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            bath_flag = true;
        }
    }

    public void cleaning(View view) {
        if (cleaning_flag) {
            this.findViewById(R.id.cleaningPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.cleaningLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            cleaning_flag = false;
        } else {
            this.findViewById(R.id.cleaningPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.cleaningLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            cleaning_flag = true;
        }
    }

    public void pets(View view) {
        if (pets_flag) {
            this.findViewById(R.id.petsPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.petsLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            pets_flag = false;
        } else {
            this.findViewById(R.id.petsPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.petsLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            pets_flag = true;
        }
    }

    public void hcs(View view) {
        if (hcs_flag) {
            this.findViewById(R.id.hcsPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.hcsLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            hcs_flag = false;
        } else {
            this.findViewById(R.id.hcsPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.hcsLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            hcs_flag = true;
        }
    }

    public void passport(View view) {
        if (passport_flag) {
            this.findViewById(R.id.passportPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.passportLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            passport_flag = false;
        } else {
            this.findViewById(R.id.passportPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.passportLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            passport_flag = true;
        }
    }

    public void dl(View view) {
        if (dl_flag) {
            this.findViewById(R.id.dlPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.dlLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            dl_flag = false;
        } else {
            this.findViewById(R.id.dlPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.dlLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            dl_flag = true;
        }
    }

    public void md(View view) {
        if (md_flag) {
            this.findViewById(R.id.mdPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.mdLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            md_flag = false;
        } else {
            this.findViewById(R.id.mdPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.mdLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            md_flag = true;
        }
    }

    public void mfc(View view) {
        if (mfc_flag) {
            this.findViewById(R.id.mfcPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.mfcLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            mfc_flag = false;
        } else {
            this.findViewById(R.id.mfcPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.mfcLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            mfc_flag = true;
        }
    }

    public void hcsEtc(View view) {
        if (hcsEtc_flag) {
            this.findViewById(R.id.hcsEtcPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.hcsEtcLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            hcsEtc_flag = false;
        } else {
            this.findViewById(R.id.hcsEtcPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.hcsEtcLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            hcsEtc_flag = true;
        }
    }

    public void hospital(View view) {
        if (hospital_flag) {
            this.findViewById(R.id.hospitalPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.hospitalLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            hospital_flag = false;
        } else {
            this.findViewById(R.id.hospitalPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.hospitalLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            hospital_flag = true;
        }
    }

    public void registry(View view) {
        if (registry_flag) {
            this.findViewById(R.id.registryPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.registryLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            registry_flag = false;
        } else {
            this.findViewById(R.id.registryPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.registryLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            registry_flag = true;
        }
    }

    public void rent(View view) {
        if (rent_flag) {
            this.findViewById(R.id.rentPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.rentLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            rent_flag = false;
        } else {
            this.findViewById(R.id.rentPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.rentLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            rent_flag = true;
        }
    }

    public void estate(View view) {
        if (estate_flag) {
            this.findViewById(R.id.estatePlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.estateLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            estate_flag = false;
        } else {
            this.findViewById(R.id.estatePlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.estateLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            estate_flag = true;
        }
    }

    public void pay(View view) {
        if (pay_flag) {
            this.findViewById(R.id.payPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.payLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            pay_flag = false;
        } else {
            this.findViewById(R.id.payPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.payLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            pay_flag = true;
        }
    }

    public void dormitory(View view) {
        if (dormitory_flag) {
            this.findViewById(R.id.dormitoryPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.dormitoryLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            dormitory_flag = false;
        } else {
            this.findViewById(R.id.dormitoryPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.dormitoryLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            dormitory_flag = true;
        }
    }

    public void resume(View view) {
        if (resume_flag) {
            this.findViewById(R.id.resumePlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.resumeLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            resume_flag = false;
        } else {
            this.findViewById(R.id.resumePlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.resumeLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            resume_flag = true;
        }
    }

    public void interview(View view) {
        if (interview_flag) {
            this.findViewById(R.id.interviewPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.interviewLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            interview_flag = false;
        } else {
            this.findViewById(R.id.interviewPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.interviewLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            interview_flag = true;
        }
    }

    public void paws(View view) {
        if (paws_flag) {
            this.findViewById(R.id.pawsPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.pawsLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            paws_flag = false;
        } else {
            this.findViewById(R.id.pawsPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.pawsLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            paws_flag = true;
        }
    }

    public void salary(View view) {
        if (salary_flag) {
            this.findViewById(R.id.salaryPlus).setBackgroundResource(R.drawable.minus_ic);
            LinearLayout ll = this.findViewById(R.id.salaryLayout);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lp);
            salary_flag = false;
        } else {
            this.findViewById(R.id.salaryPlus).setBackgroundResource(R.drawable.plus);
            LinearLayout ll = this.findViewById(R.id.salaryLayout);
            ll.setVisibility(View.INVISIBLE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, 0);
            ll.setLayoutParams(lp);
            salary_flag = true;
        }
    }

    public void house(View view) {
        flag = 0;
        Intent main = new Intent(MainActivity.this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
    }

    public void paperRight(View view) {
        flag = 1;
        Intent main = new Intent(MainActivity.this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void paperLeft(View view) {
        flag = 1;
        Intent main = new Intent(MainActivity.this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
    }

    public void stateRight(View view) {
        flag = 2;
        Intent main = new Intent(MainActivity.this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void stateLeft(View view) {
        flag = 2;
        Intent main = new Intent(MainActivity.this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
    }

    public void housingRight(View view) {
        flag = 3;
        Intent main = new Intent(MainActivity.this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void housingLeft(View view) {
        flag = 3;
        Intent main = new Intent(MainActivity.this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
    }

    public void work(View view) {
        flag = 4;
        Intent main = new Intent(MainActivity.this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void article(View view) {
        Intent article = new Intent(MainActivity.this, Article.class);
        startActivity(article);
    }

    public void menu(View view) {
        Intent menu = new Intent(this, Menu.class);
        startActivity(menu);
    }

    public void search(View view) {
        Intent search = new Intent(this, Search.class);
        startActivity(search);
    }
}