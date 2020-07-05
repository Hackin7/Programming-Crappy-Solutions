.class final Lan;
.super Lam;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lan$a;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Lft;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lam;-><init>(Landroid/content/Context;Lft;)V

    return-void
.end method


# virtual methods
.method final a(Landroid/view/ActionProvider;)Lam$a;
    .locals 2

    new-instance v0, Lan$a;

    iget-object v1, p0, Lan;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1}, Lan$a;-><init>(Lan;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-object v0
.end method
