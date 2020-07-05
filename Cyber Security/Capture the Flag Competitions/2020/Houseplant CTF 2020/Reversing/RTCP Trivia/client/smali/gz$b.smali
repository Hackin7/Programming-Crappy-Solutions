.class final Lgz$b;
.super Lgz$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Lgz;)V
    .locals 0

    invoke-direct {p0, p1}, Lgz$a;-><init>(Lgz;)V

    return-void
.end method


# virtual methods
.method public final findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
